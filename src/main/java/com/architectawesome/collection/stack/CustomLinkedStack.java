package com.architectawesome.collection.stack;

import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by renwujie on 2018/05/28 at 21:27
 *
 * http://blog.csdn.net/javazejian/article/details/53362993 [原文地址,请尊重原创]
 *
 * 栈的链式实现
 */
public class CustomLinkedStack<T> extends Stack<T> implements Serializable{

    private static final long serialVersionUID = -2458525943861916760L;

    private NodeTmp<T> top;

    private int size;

    public CustomLinkedStack() {
        this.top = new NodeTmp<T>();
    }

    public int size() {
        return size;
    }

    @Override
    public synchronized boolean isEmpty() {
        return top == null || top.data == null;
    }

    /**
     * 入栈
     * @param item item to be added
     * @return item has been added
     */
    public T push(T item) {
        if(item == null) {
            throw new EmptyStackException();
        }
        if(this.top == null) {
            this.top = new NodeTmp<>(item);
        } else if(this.top.data == null) {
            this.top.data = item;
        } else {
            //更新栈顶
            NodeTmp<T> p = new NodeTmp<>(item, this.top);
            top = p;
        }

        size++;

        return top.data;
        //return item;
    }

    /**
     * 获取栈顶元素
     * @return
     */
    @Override
    public synchronized T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    /**
     * 出栈
     * @return item to be deleted
     */
    @Override
    public synchronized T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        T data = top.data;
        top = top.next;
        size--;
        return  data;
    }

    public static void main(String[] args){
        CustomLinkedStack<String> cls = new CustomLinkedStack<>();
        System.out.println(".isEmpty() -> " + cls.isEmpty());
        System.out.println(".size() -> " + cls.size());
        cls.push("A");
        cls.push("B");
        cls.push("C");
        System.out.println(".isEmpty() -> " + cls.isEmpty());
        System.out.println(".size() -> " + cls.size());
        System.out.println(".peek() -> " + cls.peek());
        System.out.println(".pop() -> " + cls.pop());
        System.out.println(".isEmpty() -> " + cls.isEmpty());
        System.out.println(".size() -> " + cls.size());
        System.out.println(".peek() -> " + cls.peek());
    }
}
