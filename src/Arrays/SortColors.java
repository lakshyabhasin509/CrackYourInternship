package Arrays;
//https://leetcode.com/problems/sort-colors/
//75
public class SortColors {
    public void sortColors(int[] nums) {
        int [] colors=new int[3];
        for(int i :nums){
            colors[i]++;
        }
//        NORMAL way
        int k=0;
        for(int i=0;i<nums.length;i++){
            while(k<3 && colors[k]==0)k++;
            if(colors[k]!=0){
                nums[i]=k;
                colors[k]--;
            }

        }
    }
}
