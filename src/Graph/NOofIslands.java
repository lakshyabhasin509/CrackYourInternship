package Graph;
//https://leetcode.com/problems/number-of-islands/
//200
public class NOofIslands {

        public int numIslands(char[][] grid) {
            boolean vis[][]=new boolean[grid.length][grid[0].length];
            int count=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]=='1' && !vis[i][j]){
                        dfs(i,j,vis,grid);
                        count++;
                    }
                }
            }

            return count;
        }

        public void dfs(int row,int col,boolean vis[][],char grid[][]){
            if(row<0 || col<0 || row>=grid.length || col>=grid[0].length||grid[row][col]=='0'||vis[row][col])return;

            vis[row][col]=true;

            dfs(row+1,col,vis,grid);
            dfs(row-1,col,vis,grid);
            dfs(row,col+1,vis,grid);
            dfs(row,col-1,vis,grid);
        }

    }

