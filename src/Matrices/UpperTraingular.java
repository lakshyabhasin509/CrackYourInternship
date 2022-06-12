package com.DSA.Matrices;

public class UpperTraingular {
    private int arr[][];
    private int size;

    public UpperTraingular(int size){
        this.size=size;
        arr=new int[size][];
        for(int i=0;i<size;i++){
            arr[i]=new int[size-i];
        }
    }
    public void set(int i,int j,int x){
        if(i<=j) {
            arr[i-1][j-i] = x;
        }

    }
    public int get(int i,int j){
        if(i<=j) {
            return arr[i-1][j-i-1];

        }
        return 0;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i<=j)
                    System.out.print(arr[i][j-i]+"\t");
                else System.out.print("0"+"\t");

            }
            System.out.println();
        }

    }
}
