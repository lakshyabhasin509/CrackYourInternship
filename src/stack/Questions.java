package com.DSA.stack;

import java.util.Arrays;
import java.util.Stack;
/*
TODO : leetcode 155:implementing a min stack
        933,84(Histogram)
        Celebrity problem
        Reverse First K elements of Queue
        2 stacks in an array
        reverse a string using stack
        delete middle element from stack
        insert an element at the bottom of stack
        reverse stack using recursion
        sort a stack
        N stacks in an array
        Design special stack

 */
public class Questions {
    public static void main(String[] args) {

        Questions ob = new Questions();
        int nums1[] = {4, 10, 2};
        int nums2[] = {4,5,2,10,8,1};
        int ans[]=ob.nearestSmallerLeft(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public int[] nearestSmallerRight(int[]nums1,int[]nums2){
        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> stack = new Stack<Integer>();
            for (int j = nums2.length-1; j >=0; j--) {

                int ans;
                if (stack.isEmpty()) {
                    ans = -1;
                } else {
                    if (stack.peek() < nums2[j])
                        ans = stack.peek();
                    else {
                        while (!stack.isEmpty() && stack.peek() >= nums2[j]) {
                            stack.pop();

                        }
                        if (stack.isEmpty()) ans = -1;
                        else ans = stack.peek();
                    }
                }
                stack.push(nums2[j]);
                if (nums1[i] == nums2[j]) {
                    nums1[i] = ans;
                    break;
                }
            }

        }return nums1;
    }
    public int[] nearestSmallerLeft(int[]nums1,int[]nums2){
        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> stack = new Stack<Integer>();
            for (int j = 0; j < nums2.length; j++) {

                int ans;
                if (stack.isEmpty()) {
                    ans = -1;
                } else {
                    if (stack.peek() < nums2[j])
                        ans = stack.peek();
                    else {
                        while (!stack.isEmpty() && stack.peek() >= nums2[j]) {
                            stack.pop();

                        }
                        if (stack.isEmpty()) ans = -1;
                        else ans = stack.peek();
                    }
                }
                stack.push(nums2[j]);
                if (nums1[i] == nums2[j]) {
                    nums1[i] = ans;
                    break;
                }
            }

        }return nums1;
    }
    public int[]prevGreaterElement(int[]nums1,int[]nums2){

        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> stack = new Stack<Integer>();
            for (int j = 0; j < nums2.length; j++) {

                int ans;
                if (stack.isEmpty()) {
                    ans = -1;
                } else {
                    if (stack.peek() > nums2[j])
                        ans = stack.peek();
                    else {
                        while (!stack.isEmpty() && stack.peek() <= nums2[j]) {
                            stack.pop();

                        }
                        if (stack.isEmpty()) ans = -1;
                        else ans = stack.peek();
                    }
                }
                stack.push(nums2[j]);
                if (nums1[i] == nums2[j]) {
                    nums1[i] = ans;
                    break;
                }
            }

        }return nums1;
    }

    public int[]  nextGreaterElement(int[] nums1, int[] nums2) {


        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> stack = new Stack<Integer>();
            for (int j = nums2.length - 1; j >= 0; j--) {

                int ans;
                if (stack.isEmpty()) {
                    ans = -1;
                } else {
                    if (stack.peek() > nums2[j])
                        ans = stack.peek();
                    else {
                        while (!stack.isEmpty() && stack.peek() <= nums2[j]) {
                            stack.pop();

                        }
                        if (stack.isEmpty()) ans = -1;
                        else ans = stack.peek();
                    }
                }
                stack.push(nums2[j]);
                if (nums1[i] == nums2[j]) {
                    nums1[i] = ans;
                    break;
                }
            }
        }
 return nums1;}
}
