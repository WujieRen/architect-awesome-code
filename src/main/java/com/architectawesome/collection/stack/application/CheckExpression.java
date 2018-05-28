package com.architectawesome.collection.stack.application;

import com.architectawesome.collection.stack.CustomLinkedStack;

/**
 * Created by renwujie on 2018/05/28 at 22:56
 *
 * 符号匹配
 */
public class CheckExpression {
    public static String isValid(String expStr) {
        //创建栈
        CustomLinkedStack<String> stack = new CustomLinkedStack<String>();

        int i = 0;
        while (i < expStr.length()) {
            char ch = expStr.charAt(i);
            i++;
            switch (ch) {
                case '(':
                    stack.push(ch + "");
                    break;
                case ')':
                    if (stack.isEmpty() || !stack.pop().equals("("))
                        return "(";
            }
        }

        //检测是否为空，为空检测通过
        if (stack.isEmpty()) {
            return "check pass!";
        } else {
            return "check exception";
        }
    }

    public static void main(String[] args) {
        String expStr = "((5-3)*8-2)";
        System.out.println(isValid(expStr));
    }
}
