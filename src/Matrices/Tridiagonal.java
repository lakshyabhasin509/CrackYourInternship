package com.DSA.Matrices;

public class Tridiagonal {
    private int arr[][];
    private int size;

    public Tridiagonal(int size){
        this.size=size;
        arr=new int[size][];
        for(int i=0;i<size;i++){
            arr[i]=new int[i+1];
        }
    }
    public void set(int i,int j,int x){
        if(i>=j) {
            arr[i-1][j-1] = x;
        }else arr[j-1][i-1]=x;

    }
    public int get(int i,int j){
        if(i>=j) {
            return arr[i-1][j-1];

        }
        return arr[j-1][i-1];

    }
    public void display(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i>=j)
                    System.out.print(arr[i][j]+"\t");
                else System.out.print(arr[j][i]+"\t");

            }
            System.out.println();
        }
    }}
