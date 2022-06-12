package com.DSA.sorting;

import java.util.Arrays;

public class    InsertionSort {
    public static void main(String[] args) {
        int[] arr={1234,12,334,123,3,43,231,234,23,123,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }

    }
}
