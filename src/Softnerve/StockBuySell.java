package Softnerve;

public class StockBuySell {
    public static void main(String[] args) {
        StockBuySell ob=new StockBuySell();
        System.out.println(ob.maxProfitBest(new int[]{7,1,5,3,6,4}));

    }
//    Brute force approach : for each element of array finding maximum to its right
//    TC-O(n^2) SC-O(1)
    public int maxProfitBrute(int [] prices){
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int max=prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]>max)max=prices[j];
            }
            int profit=max-prices[i];
            if(profit>maxProfit)
                maxProfit=profit;
        }
        return maxProfit;
    }
//optimizing time complexity using auxiliary space
// TC-O(n)  , SC-O(n)

    public int maxProfitSpace(int[] prices){
        int[] sell=new int[prices.length];
        int max=0;

//        traversing from back of array to keep in check the max on right of each element
        for (int i = sell.length-1; i >=0 ; i++) {
            if(prices[i]>max){
                max=prices[i];
            }
            sell[i]=max;
        }
        int maxProfit=0;
        for (int i = 0; i < sell.length; i++) {
            int profit=sell[i]-prices[i];

            if(profit>maxProfit)
                maxProfit=profit;

        }
        return maxProfit;
    }

//    Best approach - TC(n)
//    keeping check of minPrice and maxProfit
    public int maxProfitBest(int[] prices){
        int minSofar=prices[0];
        int maxProfit=0;

        for (int i = 0; i < prices.length; i++) {
            minSofar=Math.min(minSofar,prices[i]);
            int profit=prices[i]-minSofar;
            maxProfit=Math.max(profit,maxProfit);
            
        }
        return maxProfit;
    }
}
