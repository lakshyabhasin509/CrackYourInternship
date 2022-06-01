package Greedy;

import java.util.Scanner;

public class FractionalKnapsack {
    public static void main(String[] args) {
        System.out.println("Enter the number of objects ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []wt=new double[n];
         double profit[]=new double[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextDouble();
        }
        for (int i=0;i<n;i++){
            profit[i]=sc.nextDouble();
        }

        System.out.println("Enter the capacity of knapsack");
        double W=sc.nextDouble();
        System.out.println(fractionalKnap(wt,profit,W));

    }
   static int fractionalKnap(double[]wt,double[]profit,double W){
        double []pw=new double[wt.length];
       for (int i = 0; i < wt.length; i++) {
           pw[i]=profit[i]/wt[i];
       }

       insertion(pw,profit,wt);

       int pr=0;
       for (int i = 0; i < profit.length; i++) {
           if(wt[i]<=W){
               W-=wt[i];
               pr+=profit[i];
           }
           else{
               pr+=(W/wt[i])*profit[i];
               break;
           }
       }
       return pr;

   }
    static void insertion(double[] arr, double[]profit, double[] wt){

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swap(profit,j,j-1);
                    swap(wt,j,j-1);
                }
                else break;
            }
        }


}
static void swap(double[]arr,int i,int j){
    double temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
}

}
