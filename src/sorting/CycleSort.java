package com.DSA.sorting;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        int[] arr={5,4,1,2,3};
       cycle(arr);
        System.out.println(Arrays.toString(arr));
        StringBuffer a=new StringBuffer();

    }
    static void cycle(int[]arr){
        int i=0;
        while(i<arr.length){

            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;

            }else i++;
        }
    }



}
