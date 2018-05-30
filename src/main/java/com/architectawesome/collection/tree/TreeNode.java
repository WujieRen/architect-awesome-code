package com.architectawesome.collection.tree;

/**
 * Created by renwujie on 2018/05/30 at 18:52
 * <p>
 * Create a tree node.
 * Each node contains two pieces of data.
 * A left reference and a right reference.
 */
public class TreeNode {
    public int iData;
    public double dData;
    public TreeNode leftNode;
    public TreeNode rightNode;
    public TreeNode root;

    /**
     * show tree node info.
     */
    public void showNode() {
        System.out.println("{" + this.iData + "," + this.dData + "}");
    }

    //插入前要判断树是否为null，如果为null需要比较大小直到currentNode为null为止，插入。

    /**
     * 插入节点的过程其实就是对tree进行遍历的过程，最终根据便利条件到左右节点为null时进行添加新的节点
     */
    public void insert(int iData, double dData) {
        //创建node节点
        TreeNode newNode = new TreeNode();
        newNode.iData = iData;
        newNode.dData = dData;
        //判断rootNode是否为空
        if (root == null) {
            root = newNode;
        } else {
            TreeNode currentNode = root;
            TreeNode parentNode;
            while (true) {
                parentNode = currentNode;
                if (iData < currentNode.iData) {
                    currentNode = currentNode.leftNode;
                    if (currentNode == null) {
                        parentNode.leftNode = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightNode;
                    if (currentNode == null) {
                        parentNode.rightNode = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 在tree中寻找关键字
     * 返回一个node
     * @param key searchKey
     * @return findKey
     */
    public TreeNode find(int key) {
        TreeNode currentNode = root;
        while(currentNode.iData != key) {
            if(currentNode.iData < key) {
                currentNode = currentNode.rightNode;
            } else {
                currentNode = currentNode.leftNode;
            }

            if(currentNode == null) {
                return null;
            }
        }

        return currentNode;
    }

    /**
     * 获取最值
     * @return a treeNode array
     */
    public TreeNode[] minAndMaxValue() {
        TreeNode minNode = null;
        TreeNode maxNode = null;
        TreeNode[] result = new TreeNode[2];
        TreeNode currentNode = root;//从树顶开始搜索
        while(currentNode != null) {
            minNode = currentNode;
            currentNode = currentNode.leftNode;
        }
        result[0] = minNode;

        currentNode = root;
        while(currentNode != null) {
            maxNode = currentNode;
            currentNode = currentNode.rightNode;
        }
        result[1] = maxNode;

        return result;
    }
}
