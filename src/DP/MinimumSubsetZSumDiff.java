package DP;

import java.util.Scanner;

public class MinimumSubsetZSumDiff {

    MinimumSubsetZSumDiff(int n,int sum){
        dp=new int[n+1][sum+1];

        memset();
    }

    private void memset() {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }

        }
    }

    int[][] dp;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        MinimumSubsetZSumDiff ob=new MinimumSubsetZSumDiff(arr.length,sum);

        System.out.println(ob.minDifference(arr,arr.length,0,sum));
    }


    int minDifference(int[] arr,int n,int sum,int total){
        if(n==0)return Math.abs((total-sum)-sum);

        if(dp[n][sum]!=-1)return dp[n][sum];

        int taken=minDifference(arr,n-1,sum+arr[n],total);
        int notTaken=minDifference(arr,n-1,sum,total);

        return dp[n][sum]=Math.min(taken,notTaken);
    }

}
