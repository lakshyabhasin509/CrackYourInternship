package com.DSA.stack;

import java.util.Stack;

public class MaxAreaHistogram {
   static class Pair{
        int index;
       long val;

        public Pair() {
        }

        public Pair(int i, long val){
            this.index=i;
            this.val=val;
        }}







    public static int getMaxArea(int hist[], int n) {

       int max;

       int right[]=new int[hist.length];
       int left[]=new int[hist.length];

// Nearest Smaller to right
        Stack<Pair> stack=new Stack<>();
        for (int j = hist.length-1; j >=0; j--) {

           int ans;
            if (stack.isEmpty()) {
                ans = hist.length;
            } else {
                if (stack.peek().val < hist[j])
                    ans = stack.peek().index;
                else {
                    while (!stack.isEmpty() && stack.peek().val >= hist[j]) {
                        stack.pop();

                    }
                    if (stack.isEmpty()) ans = hist.length;
                    else ans = stack.peek().index;
                }
            }
            stack.push(new Pair(j, hist[j]));
            right[j] = ans;

        }
   stack=new Stack<>();
        for (int j = 0; j < hist.length; j++) {

            int ans;
            if (stack.isEmpty()) {
                ans = -1;
            } else {
                if (stack.peek().val < hist[j])
                    ans = stack.peek().index;
                else {
                    while (!stack.isEmpty() && stack.peek().val >= hist[j]) {
                        stack.pop();

                    }
                    if (stack.isEmpty()) ans = -1;
                    else ans = stack.peek().index;
                }
            }
            stack.push(new Pair(j, hist[j]));
            left[j] = ans;

        }
int area[]=new int[hist.length];
        for (int i = 0; i < hist.length; i++) {
            area[i]=hist[i]*((right[i]-left[i])-1);
        }
        max=area[0];
        for (int l : area) {
            if (l > max) max = l;
        }




    return max;}
}
