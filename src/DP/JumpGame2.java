package DP;
//https://leetcode.com/problems/jump-game-ii/
import java.util.Arrays;

public class JumpGame2 {
    class Solution {
        public int jump(int[] nums) {

            int n=nums.length;
            int dp[]=new int[nums.length];

            for(int i=n-2;i>=0;i--){
                if(nums[i]+i>=nums.length-1)dp[i]=1;
                else if(nums[i]==0)dp[i]=0;
                else {
                    dp[i]=minSteps(i,i+nums[i],dp);
                }
            }


            System.out.println(Arrays.toString(dp));
            return dp[0];
        }
        int minSteps(int start,int end,int []dp){
            int min=Integer.MAX_VALUE;

            for(int i=start+1;i<=end;i++){
                if(dp[i]==0)continue;
                min=Math.min(dp[i],min);
            }
            if(min==Integer.MAX_VALUE)return 0;
            return min+1;
        }
    }
}
