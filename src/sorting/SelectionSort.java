package com.DSA.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1234,12,334,123,3,43,231,234,23,123,4};
        UnstableSelection(arr);
        System.out.println(Arrays.toString(arr));
    }
//    select an element and put it in its right place
//    Worst and Best Case complexity is O(n^2)
    static void stableSelectionsort(int[]arr){
    for (int i=0;i<arr.length;i++){

        for (int j = i+1; j <arr.length; j++) {
            if(arr[j]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

    }
    }
    static int searchMin(int[] arr,int start){
        int minIndex=-1;
        int min=Integer.MAX_VALUE;
        for (int i = start; i <arr.length; i++) {
        if(arr[i]<min){
            min=arr[i];
        minIndex=i;
        }}
        return minIndex;
    }
    static void UnstableSelection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=searchMin(arr,i);
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
