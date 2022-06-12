package com.DSA.stack;

public class Main {
    public static void main(String[] args) throws Exception {
//        StackLL stack=new StackLL(10);
//        stack.add(10);
//        stack.add(20);
//        stack.add(90);
//        stack.add(60);
//        stack.add(22);
//        stack.add(26);
//        stack.add(1);
//        stack.peek();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        stack.display();
//        System.out.println(stack.get(1));
//    }


//    StockSpanner ob=new StockSpanner();
//        System.out.println(ob.next(100));
//        System.out.println(ob.next(80));
//        System.out.println(ob.next(60));
//        System.out.println(ob.next(70));
//        System.out.println( ob.next(60));
//        System.out.println(ob.next(75));
//        System.out.println(ob.next(85));
//int arr[]={2,4};
//int pr=MaxAreaHistogram.getMaxArea(arr,arr.length);
//        System.out.println(pr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
maxInBinaryMatrix ob=new maxInBinaryMatrix();

int max=ob.maxArea(new int[][]{{0,1,1,0},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,0,0}});
        System.out.println(max);

//
//    }
//    QUESTIONS AND THE PATTERN
/*

        1.Nearest smaller or greater to left or right
        WE WILL USE CONCEPTS OF 1 IN 2
        2.stock span and max area of histogram
        THEN CONCEPT OF 2 WILL BE USED IN 3
        3.Max area of Rectangle in Binary Matrix

           NEXT COMES SOLO CONCEPT QUESTIONS WHICH ARE REALLY IMOPORTANT

        4.Rain water trapping
        5.Implementing a min stack
        6.Longest valid paranthesis
        7.The celebrity problem
        8.Iterative tower of hanoi

        


 */
}}
