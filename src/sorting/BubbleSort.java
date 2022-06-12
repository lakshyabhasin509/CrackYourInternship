package com.DSA.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1234,12,334,123,3,43,231,234,23,123,4};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
//    the biggest element comes at the last then second last and so on
//    bubble sort is a also known as synching sort or exchanging sort
//    it is a stable sorting algoritm (that means the order for same value is same as that of unsorted array)
//    Worst case compexity is O(n^2)_ Best case is O(n) when the array is sorted
    static void Bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            int swap=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swap++;
            }}

            if(swap==0)
                break;

        }
    }
}
