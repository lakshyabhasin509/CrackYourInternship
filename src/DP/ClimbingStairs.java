package DP;
//70
public class ClimbingStairs {
     int climbStairs(int n) {
    int dp[]=new int[n+1];
    dp[0]=1;
    return solveTab(n,dp);
}
    public int solve(int n,int []dp){
        if(n==0)return dp[n]= 1;
        if(n<0)return 0;

        if(dp[n]!=-1)return dp[n];

        return dp[n]= solve(n-1,dp)+solve(n-2,dp);
    }

    public int solveTab(int n,int []dp){

        for(int i=1;i<dp.length;i++){
            if(i>1)
                dp[i]=dp[i-1]+dp[i-2];
            if(i<=1)dp[i]=dp[i-1];

        }
        return dp[n];
    }
}
