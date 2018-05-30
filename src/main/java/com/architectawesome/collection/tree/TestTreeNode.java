package com.architectawesome.collection.tree;

/**
 * Created by renwujie on 2018/05/30 at 19:46
 */
public class TestTreeNode {
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        tree.insert(3, 3.666);
        tree.insert(1, 1.111);
        tree.insert(2, 2.362);
        tree.insert(4, 4.672);
        tree.insert(5, 5.865);
        tree.insert(6, 6.681);

        TreeNode treeNode = tree.find(6);
        if(treeNode == null) {
            System.out.println("not exists!");
        } else {
            treeNode.showNode();
        }

        //查找tree中的最值
        TreeNode[] temp = tree.minAndMaxValue();
        temp[0].showNode();
        temp[1].showNode();
    }




}
