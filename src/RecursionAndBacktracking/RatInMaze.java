package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

//in a 2D array moving from a particular index to the end of array(exit)
//this class contains seperate function to perform different tasks
//we can move only Down and right in the 2D array
public class RatInMaze {

    public static void main(String[] args) {
        RatInMaze ob=new RatInMaze();
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the rows of the array");
//        int r=sc.nextInt();
//        System.out.println("Enter the columns of the array");
//        int c=sc.nextInt();
        int[][]arr={{1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {1, 1, 0, 0},
                    {0, 1, 1, 1}};
        System.out.println(ob.noOfWays(arr,0,0));
        System.out.println(ob.paths(arr,0,0));
    }
    public int noOfWays(int[][]arr,int r,int c){
        if(r>=arr.length || c>=arr[0].length || arr[r][c]==0)return 0;

        if(r==arr.length-1 && c==arr[0].length-1)return 1;

        int down=noOfWays(arr,r+1,c);
        int right=noOfWays(arr,r,c+1);

        return down+right;
    }
    public ArrayList<String> paths(int [][]arr,int r,int c){
        return pathsFind(arr,0,0,"");
    }

    private ArrayList<String> pathsFind(int[][] arr, int r, int c, String s) {
        if(r>=arr.length || c>=arr[0].length || arr[r][c]==0)return new ArrayList<>();

        if(r==arr.length-1 && c==arr[0].length-1){
            ArrayList<String> temp=new ArrayList<>();
            temp.add(s);
            return temp;
        }

        ArrayList<String> down=pathsFind(arr,r+1,c,s+"D");
        ArrayList<String> right=pathsFind(arr,r,c+1,s+"R");
        down.addAll(right);
        return down;
    }

}
