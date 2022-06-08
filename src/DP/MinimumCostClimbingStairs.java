package DP;
//https://leetcode.com/problems/min-cost-climbing-stairs/submissions/
public class MinimumCostClimbingStairs {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int dp[]=new int[cost.length+1];
            memset(dp);
            return solveIter(cost,cost.length,dp);
        }
        void memset(int[]dp){
            dp[0]=dp[1]=0;
        }
        int solveMem(int[] arr,int n,int dp[]){

            if(n==0 || n==1)return 0;
            if(dp[n]!=-1)return dp[n];
            int oneStep=solveMem(arr,n-1,dp)+arr[n-1];
            int twoStep=solveMem(arr,n-2,dp)+arr[n-2];

            return dp[n]= Math.min(oneStep,twoStep);
        }
        int solveIter(int[] arr,int n,int dp[]){

            for(int i=2;i<dp.length;i++){
                int oneStep=dp[i-1]+arr[i-1];
                int twoSteps=dp[i-2]+arr[i-2];
                dp[i]=Math.min(oneStep,twoSteps);
            }
            return dp[n];
        }
    }
}
