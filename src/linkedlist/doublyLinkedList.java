package com.DSA.linkedlist;

public class doublyLinkedList {
    Node head;

    public void insertHead(int val){
        Node temp=new Node(val);
        temp.next=head;
        temp.prev=null;
        if (head != null) {
            head.prev=temp;
        }
        head=temp;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){

            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
