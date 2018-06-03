package com.architectawesome.dataStructureAndAlgorithms.collection.stack;

/**
 * Created by renwujie on 2018/05/28 at 21:32
 */
public class NodeTmp<T> {
    public T data;//数据域
    public NodeTmp<T> next;//地址域


    public NodeTmp() {
    }

    public NodeTmp(T data) {
        this.data = data;
    }

    public NodeTmp(T data, NodeTmp<T> next) {
        this.data = data;
        this.next = next;
    }
}

