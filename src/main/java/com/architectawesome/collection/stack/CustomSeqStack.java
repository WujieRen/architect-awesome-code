package com.architectawesome.collection.stack;

import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by renwujie on 2018/05/28 at 20:52
 *
 * http://blog.csdn.net/javazejian/article/details/53362993 [原文地址,请尊重原创]
 *
 * 栈的顺序实现
 */
public class CustomSeqStack<T> extends Stack<T> implements Serializable {

    private static final long serialVersionUID = -8154175628361993532L;

    /**
     * 栈顶指针，-1代表空栈
     */
    private int top = -1;
    /**
     * 元素容量，默认给10
     */
    private int capacity = 10;
    /**
     *存放元素
     */
    private T[] array;
    /**
     * 元素个数
     */
    private int size;

    public CustomSeqStack(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public CustomSeqStack() {
        array = (T[]) new Object[this.capacity];
    }

    public int size() {
        return size;
    }

    /**
     * 判空
     * @return boolean
     */
    @Override
    public synchronized boolean isEmpty() {
        return this.top == -1;
    }

    /**
     * 入栈，从栈顶（数组尾部）插入
     */
    public T push(T item) {
        //判断容量是否够
        if(array.length == size)
            ensureCapacity(size*2+1);
        size++;
        return array[++top] = item;
    }

    /**
     * 获取栈顶元素的值，不删除
     */
    public T peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return array[top];
    }

    /**
     * 出栈
     */
    public T pop() {
        if(isEmpty())
            throw new EmptyStackException();
        size--;
        return array[top--];
    }

    /**
     * 扩容
     */
    public void ensureCapacity(int capacity) {
        //如果需要扩展的容量比现在数组的容量还小，则无需扩容
        if(capacity < size)
            return;
        //不够大就扩容
        T[] old = array;
        array = (T[])new Object[capacity];
        //复制元素
        for(int i = 0; i < size; ++i) {
            array[i] = old[i];
        }
    }

    public static void main(String[] args){
        CustomSeqStack<String> customSeqStack = new CustomSeqStack<String>();
        System.out.println("是否为空:" + customSeqStack.isEmpty());
        System.out.println("size ->" + customSeqStack.size());
        customSeqStack.push("renwujie");
        customSeqStack.push("sixin");
        customSeqStack.push("wangxin");
        System.out.println("size ->" + customSeqStack.size);
        System.out.println(".peek() -> " + customSeqStack.peek());
        System.out.println(".pop() -> " + customSeqStack.pop());
        System.out.println(".peek() -> " + customSeqStack.peek());
        System.out.println(".size() -> " + customSeqStack.size());

    }
}
