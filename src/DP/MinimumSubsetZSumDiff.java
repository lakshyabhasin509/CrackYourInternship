package DP;

import java.util.Scanner;

public class MinimumSubsetZSumDiff {

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
        MinimumSubsetZSumDiff ob=new MinimumSubsetZSumDiff();

        System.out.println(ob.minDifference(arr,0,0,sum));
    }

    int minDifference(int[] arr,int n,int sum,int total){
        if(n== arr.length)return Math.abs((total-sum)-sum);

        int taken=minDifference(arr,n+1,sum+arr[n],total);
        int notTaken=minDifference(arr,n+1,sum,total);

        return Math.min(taken,notTaken);
    }

}
