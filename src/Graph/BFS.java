package Graph;

import java.util.*;

public class BFS {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs =new ArrayList<>();
        boolean vis[]=new boolean[V];

//        for(int i=0;i<V;i++){
//            if(vis[i]==false){
        Queue<Integer> q =new ArrayDeque<>();
        q.add(0);
        vis[0]=true;

        while(!q.isEmpty()){
            int n=q.poll();
            bfs.add(n);
            for (int j:adj.get(n)) {

                if(!vis[j]){
                    q.add(j);
                    vis[j]=true;
                }
            }
        }


        return bfs;
    }

}
