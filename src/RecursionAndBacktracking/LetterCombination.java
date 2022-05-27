package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.letterCombinations("234"));
    }
   static class Solution {
        public List<String> letterCombinations(String digits) {
            if(digits.length()==0)return new ArrayList<>();
            String processed="";
            String mapping[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            List<String> list=solve(digits,processed,mapping);
            return list;

        }
        public List<String> solve(String digits,String processed,String[] mapping){
            if(digits.length()==0){
                List<String> list=new ArrayList<>();
                list.add(processed);
                return list;
            }
            List<String> list=new ArrayList<>();
            int val=digits.charAt(0)-'0';
            for(int i=0;i<mapping[val].length();i++){
                list.addAll(solve((digits.substring(1)),processed+mapping[val].charAt(i),mapping));
            }
            return list;
        }
    }
}
