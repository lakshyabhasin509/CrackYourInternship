package DP;
//https://leetcode.com/problems/house-robber/
public class HouseRobber {
    class Solution {

        public int rob(int[] nums) {
            return solve(nums,nums.length);

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
