package com.DSA.stack;

import com.DSA.linkedlist.LinkedList;

public class StackLL extends LinkedList {

    public void add(int val){
        super.insertatHead(val);
    }
    public int pop(){
        int val=super.deletehead();
        return val;
    }
    public int peek(){
        int val=super.getHead();
        return val;
    }
    public int peek(int index){
        return super.get(index);
    }
    public void display(){
        super.display();
    }
    public StackLL(int size) {
        super();
    }
}
