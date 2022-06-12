package com.DSA.Matrices;
//Element whose row is less or equal to column is non-zero
//if(i<=j) arr[i][j] is non negative
public class LowerTriangularMatrix {
    private int arr[][];
    private int size;

    public LowerTriangularMatrix(int size){
        this.size=size;
        arr=new int[size][];
        for(int i=0;i<size;i++){
            arr[i]=new int[i+1];
        }
    }
    public void set(int i,int j,int x){
        if(i>=j) {
            arr[i-1][j-1] = x;
        }

    }
    public int get(int i,int j){
        if(i>=j) {
          return arr[i-1][j-1];

        }
        return 0;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i>=j)
                    System.out.print(arr[i][j]+"\t");
                else System.out.print("0"+"\t");

            }
            System.out.println();
        }

    }

}
