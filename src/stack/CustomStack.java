package com.DSA.stack;

public class CustomStack {
protected int[]data;
private static final int DEFUALT_SIZE=10;
int top=-1;
    public CustomStack() {
        this(DEFUALT_SIZE);
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }
    public boolean add(int num){
        if(isFull()){


            System.out.println("Stack is full");
            return false;
        }
        data[++top]=num;
  return true;  }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Emplty");

        }return data[top--];
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("cannot peek an Empty stack");
        }
        return data[top];
    }

    public boolean isFull(){
        return top==data.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
