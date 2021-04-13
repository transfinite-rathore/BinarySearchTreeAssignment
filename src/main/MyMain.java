package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree obj=new MyBinarySearchTree();
        obj.insert(12);
        obj.insert(56);
        obj.insert(59);
        obj.insert(64);
        obj.insert(55);
        //boolean c=obj.search(56);
        //System.out.println(c);
        obj.inOrder(obj.getRoot());
    }
}
