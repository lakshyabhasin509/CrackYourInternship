package DP;

import java.util.Scanner;


public class MinSubsumDiff {
    int dp[];
    MinSubsumDiff(int n){
        dp=new int[n+1];
        memset();
    }


    private void memset() {
        for (int i = 0; i < dp.length; i++) {
            dp[i]=-1;

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        MinSubsumDiff ob=new MinSubsumDiff(sum);
        System.out.println(ob.minDiff(arr,0,sum, arr.length));

    }

    int minDiff(int[] arr,int sum,int total,int n){
        if(n==0)return Math.abs(total-2*sum);

        if(dp[sum]!=-1)return dp[sum];
        int accept=minDiff(arr,sum+arr[n-1],total,n-1);
        int reject=minDiff(arr,sum,total,n-1);

        return dp[sum]=Math.min(accept,reject);
    }
}