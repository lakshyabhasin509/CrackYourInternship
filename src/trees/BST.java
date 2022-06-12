package com.DSA.trees;

import java.util.Scanner;

public class BST {
    Node root;
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public Node search(int data){
        Node temp=root;
        while(temp!=null){
           if(temp.data==data)return temp;
           else if(data> temp.data)temp=temp.right;
           else temp=temp.left;
        }
        return temp;
    }
void insert(int data){

    Node t=root;
        Node temp=null;
        if(root==null){
            root=new Node(data);
            return;
        }
        while (t!=null){
            temp=t;
            if(data>t.data)t=t.right;
            if(data<t.data)t=t.left;
            else return;
        }

        if(data>temp.data)temp.right=new Node(data);
        else temp.left=new Node(data);
}
void createBST(){
    System.out.println("Enter -1 to stop inserting in the BST");
    Scanner sc=new Scanner(System.in);
        while (true){
            int in=sc.nextInt();
            if(in==-1)return;

            insert(in);

        }

}
Node delete(int key){
        return deleteNode(root,key);
}
Node deleteNode(Node ptr,int key){
        if(ptr==null)return null;
        if(ptr.data==key){

            if(root.right==null && root.left==null)return null;
        }
        else if(ptr.data>key){
           ptr.left=deleteNode(ptr.left,key);
           return ptr;
        }
        else {
            ptr.right = deleteNode(ptr.right, key);
        return ptr;
        }
    return ptr;
}
}
