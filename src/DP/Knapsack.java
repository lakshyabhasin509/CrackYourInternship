package DP;

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
    Knapsack ob=new Knapsack(5,18);
    int res=ob.O_1_KnapsaIter(new int[]{1,3,7,4,5},new int[]{1,4,7,5,7},18,5);
        System.out.println(ob.O_1_KnapsackMem(new int[]{1,3,7,4,5},new int[]{1,4,7,5,7},18,5));
        System.out.println(res);
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
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {

                if(weight[i-1]>j)

                  dp[i][j]= dp[i-1][j];

                else dp[i][j]=Math.max(price[i-1]+dp[i-1][j-weight[i-1]],
                        dp[i-1][j]);
            }
        }
        return dp[n][W];


    }

}

