package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfs=new ArrayList<Integer>();
        boolean visited[]=new boolean[V];
        dfsHelp(0,visited,adj,dfs);
        return dfs;


    }
    void dfsHelp(int node,
                 boolean[] visited,
                 ArrayList<ArrayList<Integer>> adj,
                 ArrayList<Integer> dfs){

        dfs.add(node);
        visited[node]=true;

        for(int i : adj.get(node)){
            if(visited[i]==false){
                dfsHelp(i,visited,adj,dfs);
            }
        }


    }

    public ArrayList<Integer> dfsOfGraphNoRec(int V,
                                              ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> dfs=new ArrayList<Integer>();
        boolean visited[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();


        stack.add(0);
        visited[0]=true;
        while(!stack.isEmpty()){

            int cur =stack.pop();
            dfs.add(cur);


            for (int neighbor:adj.get(cur)) {

                if (!visited[neighbor]) {
                    visited[neighbor]=true;
                    stack.add(neighbor);
                }
            }


        }
        return dfs;
    }

}
