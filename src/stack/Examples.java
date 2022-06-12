package com.DSA.stack;

import java.util.Stack;

//Only a top Last in first out (LIFO)
public class Examples {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack  <Integer>();
    stack.push(12);
    stack.push(11);
    stack.push(122);
    stack.push(125);
    stack.push(192);
    stack.isEmpty();
        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
