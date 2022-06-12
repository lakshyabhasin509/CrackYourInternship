package com.DSA.sorting;

public class QuickSort {
    public static void main(String[] args) {
int arr[]={1,341,234,324,3,2,23,423,42,343,423,Integer.MAX_VALUE};
QuickSort(arr,0,arr.length);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int partition(int arr[],int s,int e){
       int mid=s+(e-s)/2;
       int pivot=arr[mid];

        while(s<=e)
        {
            do{
                s++;
            }while(arr[s]<=pivot);
            do{
                e--;
            }while(arr[e]>pivot);
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }



        return e;
    }
   static void QuickSort(int arr[],int l,int h){
        if(l>=h)return;
int j;

        j=partition(arr,l,h);
        QuickSort(arr,l,j);
        QuickSort(arr,j+1,h);

    }
}
