package DP;

import java.util.Scanner;

public class EqualSumParition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {

        arr[i]= sc.nextInt();
        }

        EqualSumParition ov=new EqualSumParition();
        System.out.println(ov.isEqual(arr));
    }

    boolean isEqual(int arr[]){

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        if(sum%2!=0)return false;

        return checkIfTarget(arr,sum/2,arr.length);
    }
    private boolean checkIfTarget(int []arr, int target,int n){
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
}
