package Graph;
//https://leetcode.com/problems/flood-fill/
//733
public class FloodFill {

    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

            int[][] res=image.clone();
            boolean[][] vis=new boolean[res.length][res[0].length];
            int prevColor=image[sr][sc];
            solve(res,sr,sc,newColor,vis,prevColor);
            return res;
        }

        public void solve(int[][] image, int sr, int sc, int newColor,boolean[][] vis,int prevColor){

            if(sr<0 || sc<0 || sr>=image.length|| sc>=image[0].length|| vis[sr][sc]||image[sr][sc]!=prevColor)return ;

            vis[sr][sc]=true;
            image[sr][sc]=newColor;

            solve(image,sr+1,sc,newColor,vis,prevColor);
            solve(image,sr-1,sc,newColor,vis,prevColor);
            solve(image,sr,sc+1,newColor,vis,prevColor);
            solve(image,sr,sc-1,newColor,vis,prevColor);
        }
    }
}
