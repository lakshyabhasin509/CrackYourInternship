package DP;

import java.util.Scanner;

public class Knapsack {
    //int[] weight;
//int[] price;
//int W;//capacity
    int[][]dp;
    Knapsack(int n,int W)
    {
        dp=new int[100][100];
        memset(dp);
    }

    private void memset(int[][] dp) {

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                dp[i][j]=-1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n=sc.nextInt();
        int wt[]=new int[n];
        int []profit=new int[n];
        for(int i=0;i<n;i++){
            wt[i]= sc.nextInt();
            profit[i]=sc.nextInt();
        }
        System.out.println("Enter the capacity of knapsack");

        int W=sc.nextInt();


        Knapsack ob=new Knapsack(n,W);
        System.out.println(ob.O_1_Knapsack(wt,profit,W,n));
        System.out.println(ob.O_1_KnapsackMem(wt,profit,W,n));
        System.out.println(ob.O_1_KnapsaIter(wt,profit,W,n));
//
//        2 10 3 5 5 15 7 7 1 6 4 18 1 3
//         5 15 7 6 18 3
//        7
//        15
    }


    //Recursive only
    int O_1_Knapsack(int[]weight,int[] price,int W,int n){
        if(n==0||W==0)return 0;

        if(weight[n-1]>W)return O_1_Knapsack(weight,price,W,n-1);

        else return Math.max(price[n-1]+O_1_Knapsack(weight,price,W-weight[n-1],n-1),
                O_1_Knapsack(weight,price,W,n-1));

    }


    //    Recursive + DP (taking a matrix to reduce extra recursive calls to happen)
    int O_1_KnapsackMem(int[]weight,int[] price,int W,int n){
        if(n==0||W==0)return 0;

        if(dp[n][W]!=-1)
            return dp[n][W];
        if(weight[n-1]>W)return dp[n][W]= O_1_Knapsack(weight,price,W,n-1);

        else return dp[n][W]= Math.max(price[n-1]+O_1_Knapsack(weight,price,W-weight[n-1],n-1),
                O_1_Knapsack(weight,price,W,n-1));
    }

    int O_1_KnapsaIter(int[]weight,int[] price,int W,int n){
        int[][]t=new int[n+1][W+1];

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
            }
        }

        for (int[]arr:t) {
            for(int i:arr)
                System.out.print(i);
            System.out.println();
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {

                if(weight[i-1]>j)

                    t[i][j]= t[i-1][j];

                else t[i][j]=Math.max(price[i-1]+t[i-1][j-weight[i-1]],
                        t[i-1][j]);
            }
        }
        return t[n][W];


    }

}