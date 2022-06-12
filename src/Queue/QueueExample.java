package com.DSA.Queue;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(10);
        queue.add(111);
        queue.add(190);
        queue.add(19);
        queue.add(12);
        queue.add(11);
        queue.add(1);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> de=new ArrayDeque<Integer>();
        de.add(10);






    }
}
