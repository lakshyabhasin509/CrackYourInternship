package com.DSA.Matrices;
//matix of 5*5 having numbers only in the diagonal else everything is zero
//matrix[i][j]=0 when i!=j
public class DiagonalMatrix {
   private int arr[];
   private int size;
    public DiagonalMatrix(int size){
        this.size=size;
        arr=new int[this.size];

    }
    public void set(int i,int j,int x){
        if(i==j)arr[i-1]=x;
    }
    public int get(int i,int j){
        if(i==j)return arr[i-1];

        return 0;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j)
                System.out.print(arr[i]+"\t");
                else System.out.print("0"+"\t");

            }
            System.out.println();
        }

    }

}
