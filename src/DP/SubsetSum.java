package DP;

import javax.xml.stream.events.StartDocument;
import java.util.Scanner;

public class SubsetSum {

    int [][]dp;
    SubsetSum(int n,int target){
        dp=new int[n+1][target+1];
        memset(dp);

    }

    private void memset(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the Target");
        int target=sc.nextInt();
        SubsetSum ob=new SubsetSum(n,target);

        System.out.println( ob.countSubsetsMem(arr,target,arr.length));
        System.out.println(ob.countSubsetsIter(arr,target,arr.length));

    }
    boolean isSubsetSum(int arr[],int target){
        return checkIfTargetRec(arr,target,0);

    }

    private boolean checkIfTargetRec(int[] arr, int target, int n) {
        if(target==0)return true;

        if(n==arr.length)
        return false;




        if(arr[n]<=target)return checkIfTargetRec(arr,target-arr[n],n+1)
                || checkIfTargetRec(arr,target,n+1);
        else return checkIfTargetRec(arr,target,n+1);


    }

    private boolean checkIfTargetMem(int []arr, int target,int n){
        if(target==0)return true;
        if(n==0)
            return false;

        if(dp[n][target]!=-1)return dp[n][target] == 1;
        if(arr[n-1]<=target)
        {
            boolean temp=checkIfTargetMem(arr,target-arr[n-1],n-1) || checkIfTargetMem(arr,target,n-1);
            dp[n][target]=temp?1:0;
            return temp;
        }
        else
        {
            boolean temp=checkIfTargetRec(arr,target,n-1);
            dp[n][target]=temp?1:0;
            return temp;
        }
    }
    private boolean checkIfTargetIter(int []arr, int target,int n){
       boolean t[][]=new boolean[n+1][target+1];


        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {

                if(j==0)t[i][j]=true;

                if(i==0 && j>0)t[i][j]=false;
            }
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++){

                if(arr[i-1]>j)t[i][j]=t[i-1][j];

                else
                    t[i][j]=t[i-1][j]||t[i-1][j-arr[i-1]];

            }
        }

                return t[n][target];
    }


    int count(int arr[],int target){
        return countSubsetsMem(arr,target,arr.length);
    }

    private int countSubsetsMem(int[] arr, int target, int n) {
        if(target==0)return 1;
        if(n==0)
            return 0;

        if(dp[n][target]!=-1)return dp[n][target];
        if(arr[n-1]<=target)
        return dp[n][target]=countSubsetsMem(arr,target,n-1)
                +countSubsetsMem(arr,target-arr[n-1],n-1);
        else
            return dp[n][target]=countSubsetsMem(arr, target, n-1);


    }
    private int countSubsetsIter(int[] arr, int target, int n) {
        int[][]t=new int[n+1][target+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j <target+1 ; j++) {
                if(j==0)t[i][j]=1;

                if(i==0 && j>0)t[i][j]=0;
            }

        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < target+1; j++) {
                if(arr[i-1]<=j)
                    t[i][j]=t[i-1][j]+t[i-1][j-arr[i-1]];
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[n][target];
    }
}
