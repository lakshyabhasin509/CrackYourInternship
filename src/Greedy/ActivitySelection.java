package Greedy;

import java.util.Scanner;

public class ActivitySelection {
    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []start=new int[n];
        int finish[]=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            finish[i]=sc.nextInt();
        }

    }
    static int maxActivities(int[]start,int[] finish){
        insertion(finish,start);
        int count=0;

      return 0;
    }
    static void insertion(int[] arr, int[]start){

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swap(start,j,j-1);
                }
                else break;
            }
        }


    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

}
