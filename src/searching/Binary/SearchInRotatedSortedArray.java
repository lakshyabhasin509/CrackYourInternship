package com.DSA.searching.Binary;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {


    }
    static int FindPivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if(mid <end &&arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
                return mid;
            if(arr[start]<=arr[mid]){
                end=mid-1;
                if(arr[start]>arr[mid])
                    start=mid+1;
            }
        }
return -1;
    }
    static int BinarySearch(int arr[],int key,int start,int end){
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
