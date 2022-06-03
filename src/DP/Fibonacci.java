package DP;
//509
public class Fibonacci {

        public int fib(int n) {
            if(n<=1)return n;
            int prev1=0;
            int prev=1;

            for(int i=2;i<n+1;i++){
                int cur=prev+prev1;

                prev1=prev;
                prev=cur;
            }

            return prev;

    }
}
