package com.DSA.searching.Binary;

public class ceilofArray {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18};
        ceilofArray ob=new ceilofArray();

        System.out.println(ob.ceil(arr,12));
    }
    int ceil(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid,ceil;

        while (start<=end){
            mid=start-((start-end)/2);
            if(arr[mid]==key)
                return key;
            else if (arr[mid]<key)
            start=mid+1;
            else{
                end=mid-1;
            }
        }
        ceil=arr[start];
        return ceil;
    }
}
