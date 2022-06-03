package DP;
//https://leetcode.com/problems/jump-game/
public class JumpGame {class Solution {
    public boolean canJump(int[] nums) {
        boolean dp[]=new boolean[nums.length];
        dp[nums.length-1]=true;


        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i==nums.length-1){
                dp[i]=true;
            }
            else{
                dp[i]=checkifpath(i,i+nums[i],dp);
            }
        }
        return dp[0];
    }

    boolean checkifpath(int start,int end,boolean[]arr){
        for(int i=start;i<=end;i++){
            if(arr[i]==true)return true;
        }
        return false;
    }
}
}
