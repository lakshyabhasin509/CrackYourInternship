package com.DSA.stack;

public class maxInBinaryMatrix {

    int maxArea(int[][] Matrix){
        int max=0;

        int[] temp=new int[Matrix[0].length];
        for (int i = 0; i < Matrix[0].length; i++) {
            temp[i]=Matrix[0][i];
        }
        max=MaxAreaHistogram.getMaxArea(temp,temp.length);
        for (int i = 1; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                if(Matrix[i][j]==0){
                    temp[j]=0;
                }
                else
                    temp[j]=temp[j]+Matrix[i][j];
            }
            max=Math.max(max,MaxAreaHistogram.getMaxArea(temp,temp.length));


        }

        return max;
    }
}
