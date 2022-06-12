package com.DSA.searching.Binary;

public class floorOfArray {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18};
        floorOfArray ob=new floorOfArray();

        System.out.println(ob.floorofarray(arr,12));
    }
    int floorofarray(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid,floor;

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
        floor=arr[end];
        return floor;
}}
