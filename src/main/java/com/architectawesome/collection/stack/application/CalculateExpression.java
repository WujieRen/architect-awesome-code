package com.architectawesome.collection.stack.application;

import com.architectawesome.collection.stack.CustomLinkedStack;
import com.architectawesome.collection.stack.CustomSeqStack;

/**
 * Created by renwujie on 2018/05/29 at 13:43
 */
public class CalculateExpression {
    public static void main(String[] args){
        String expstr="1+3*(9-2)+90";
        String postfix = toPostFix(expstr);
        System.out.println("中缀表达式->expstr=  "+expstr);
        System.out.println("后缀表达式->postfix= "+postfix);
        System.out.println("计算结果->value= "+ calculatePostFixValue(postfix));
    }

    /**
     * 中缀表达式转后缀表达式
     * @param expStr 中缀表达式
     * @return 后缀表达式
     */
    static String toPostFix(String expStr) {
        //存放运算符
        CustomSeqStack<String> stack = new CustomSeqStack<String>();
        //存放后缀表达式的字符串
        String postFix = "";

        int i = 0;
        while(i < expStr.length()) {
            char ch = expStr.charAt(i);
            switch (ch)
            {
                case '+':
                case '-':
                    //当栈不为空且栈顶元素不是'('时直接出栈，因此时只有可能是+-*/四种运算符（根据规则四），否则入栈
                    while (!stack.isEmpty() && !stack.peek().equals("(")) {
                        postFix += stack.pop();
                    }
                    stack.push(ch+"");
                    i++;
                    break;
                case '*':
                case '/':
                    while (!stack.isEmpty() && (stack.peek().equals("*") || stack.peek().equals("/"))) {
                        postFix += stack.pop();
                    }
                    stack.push(ch+"");
                    i++;
                    break;
                case '(':
                    //左括号直接入栈
                    stack.push(ch+"");
                    i++;
                    break;
                case ')':
                    //遇到右括号，规则三
                    String out = stack.pop();
                    while(out != null && !out.equals("(")) {
                        postFix += out;
                        out = stack.pop();
                    }
                    i++;
                    break;
                default:
                    while(ch >= '0' && ch <= '9') {
                        postFix += ch;
                        i++;
                        if(i < expStr.length()) {
                            ch = expStr.charAt(i);
                        } else {
                            ch = '=';
                        }
                    }
                    //分隔符
                    postFix += " ";
                    break;
            }
        }
        //最后把所有运算符出栈(规则五)
        while(!stack.isEmpty()) {
            postFix += stack.pop();
        }

        return postFix;
    }

    /**
     * 计算后缀表达式的值
     * @return 计算结果
     */
    static int calculatePostFixValue(String postFix) {
        //栈用于存储操作数，协助运算
        CustomLinkedStack <Integer> stack = new CustomLinkedStack<Integer>();
        int i = 0, result = 0;
        while(i < postFix.length()) {
            char ch = postFix.charAt(i);
            if(ch >= '0' && ch <= '9') {
                result = 0;
                while(ch != ' ') {
                    //将整数字符转成Int
                    result = result * 10 + Integer.parseInt(ch+"");
                    i++;
                    ch = postFix.charAt(i);
                }
                i++;
                stack.push(result);
            } else {
                //ch是运算符，出栈栈顶的前两个元素
                int y = stack.pop();
                int x = stack.pop();
                switch (ch) {
                    case '+': result = x+y; break;
                    case '-': result = x-y; break;
                    case '*': result = x*y; break;
                    case '/': result = x/y; break;
                }
                //将运算结果写入栈
                stack.push(result);
                i++;
            }
        }

        //将最后的结果出栈并返回
        return stack.pop();
    }
}
