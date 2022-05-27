package Softnerve;

public class SubsetXORSum {

    public static void main(String[] args) {
        SubsetXORSum ob=new SubsetXORSum();
        System.out.println(ob.subsetXOR(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
    public int subsetXOR(int[] arr){
        return subsetXOR(0,arr,0);
    }

//    recursive approach to calculate XOR sum of all subsets and adding them while backtracking
    public int subsetXOR(int res,int[] arr,int index){
        if(index== arr.length)return res;

        int XOR=arr[index]^res;

        int includeIndex=subsetXOR(XOR,arr,index+1);
        int excludeIndex=subsetXOR(res,arr,index+1);

        return includeIndex+excludeIndex;
    }
}
