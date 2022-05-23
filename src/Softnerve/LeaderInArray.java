package Softnerve;

import java.util.ArrayList;

public class LeaderInArray {
    public static void main(String[] args) {
        int arr[] = {10,10,20,70,3,1};
        LeaderInArray ob=new LeaderInArray();

        System.out.println(ob.findLeaders(arr));
    }

    public ArrayList<Integer> findLeaders(int [] arr){
        ArrayList<Integer> list=new ArrayList<>();
//        iterate backwards to keep check of elements on right
//        TC-O(n) , SC-O(1)
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }

        }
        return list;
    }
}
