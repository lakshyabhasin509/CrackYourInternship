package DP;

public class Knapsack {
//int[] weight;
//int[] price;
//int W;//capacity

//    Knapsack(int[]weight,int[] price,int capacity)
//    {
//        this.weight=weight;
//        this.price=price;
//        W=capacity;
//    }
    int O_1_Knapsack(int[]weight,int[] price,int W,int n){
        if(n==0||W==0)return 0;

        if(weight[n-1]>W)return O_1_Knapsack(weight,price,W,n-1);

        else return Math.max(price[n-1]+O_1_Knapsack(weight,price,W-weight[n-1],n-1),
                O_1_Knapsack(weight,price,W,n-1));

    }
}

