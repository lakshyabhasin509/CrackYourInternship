package DP;
//https://leetcode.com/problems/house-robber-ii/
public class HouseRobber2 {
    class Solution {
        public int rob(int[] nums) {
            int first[]=new int[nums.length-1];
            int last[]=new int[nums.length-1];
            for(int i=0;i<nums.length;i++){
                if(i!=0)last[i-1]=nums[i];
                if(i!=last.length)first[i]=nums[i];
            }
            if(nums.length==1)return nums[0];
            return Math.max(solve(first,first.length),solve(last,last.length));
        }

        int solve(int[]arr,int n){
            int prevprev=arr[0];
            int prev=prevprev;
            for(int i=1;i<n;i++){
                int accept=arr[i];
                if(i>=2)
                    accept=prevprev+arr[i];
                int reject=prev;

                int cur=Math.max(accept,reject);
                prevprev=prev;
                prev=cur;

            }
            return prev;
        }

    }
}
