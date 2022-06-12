package com.DSA.searching.Binary;

public class BinarySearch {

   static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid;

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
        return -1;
    }
}
