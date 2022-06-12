package com.DSA.searching.Binary;

public class splitArrayLargerstSum {
    public static void main(String[] args) {
        int []nums={7,2,5,8,10};
        System.out.println(splitArray(nums,2));
    }
    static int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++){

            start=Math.max(start,nums[i]) ;//linear search
            end=end+nums[i]; //sum of all elements in array
        }

        while(start<end){
            int mid=start+(end-start)/2;
            int pieces=Piece(mid,nums);
            if(pieces<=m)
                end=mid;
            else
                start=mid+1;


        }
        return end;

    }
    static int Piece(int n,int[] arr){
        int temp=n;
        int pieces=0;
        for(int i=0;i<arr.length;i++){
            temp=temp-arr[i];
            if(temp<0){

                pieces++;
                temp=n;
                temp=temp-arr[i];
            }
        }
        return pieces+1;
    }
}
