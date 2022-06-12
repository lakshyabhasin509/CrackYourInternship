package com.DSA.sorting;

import java.util.Arrays;



//mergeSort
//Divide this array into two parts and sort them
//after sorting merge those arrays using two
public class MergeSort {
    public static void main(String[] args) {
int arr[]={102392,12,23,13,43,3,23,3,2233,};
inplaceMerge(arr,0,arr.length);
System.out.println(Arrays.toString(arr));

    }

//    this function uses extra auxilary space in order to sort the array
//    O(n) space complexity
    static int[]mergeSort(int []arr){
        if(arr.length==1)return arr;
        int mid=arr.length;
        int []left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int []right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));


        return merge(left,right);

    }
    static int[] merge(int[]first,int []second){
        int[]mix=new int[first.length+second.length];
        int i=0,j=0,k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i++];
            }else mix[k]=second[j++];
            k++;
        }
        while(i<first.length){
            mix[k++]=first[i++];
        } while(i<second.length){
            mix[k++]=second[j++];
        }
        return mix;
    }

static void inplaceMerge(int arr[],int start,int end){
    if(end-start==1)return;
    int mid=start+(end-start)/2;
   inplaceMerge(arr,start,mid);
    inplaceMerge(arr,mid,end);


    mergeInPlace(arr,start,mid,end);
}
static void mergeInPlace(int arr[],int start,int mid ,int end){

       int mix[]=new int[end-start];
       int i=start;
        int j=mid;
        int k=0;

    while(i<mid&& j<end){
        if(arr[i]<arr[j]){
            mix[k]=arr[i++];
        }else mix[k]=arr[j++];
        k++;
    }
    while(i<mid){
        mix[k++]=arr[i++];
    } while(j<end){
        mix[k++]=arr[j++];
    }
    for (int l = 0; l < mix.length; l++) {
        arr[start+l]=mix[l];
    }
}

}
