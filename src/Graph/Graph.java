package Graph;


import java.util.*;

//Graph using a Map<Integer,List<Integer>> instead of List<List<Integer>>
//in the map we can use a set instead of list just to not include duplicates by mistake
public class Graph<T> {
    ArrayList<ArrayList<T>> list;
    int n;
    public Graph(int n){

        this.n=n;
        list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());

        }
        System.out.println(n);
    }

    public ArrayList<ArrayList<T>> getList() {
        return list;
    }

    public void setList(ArrayList<ArrayList<T>> list) {
        this.list = list;
    }



    //    Represented as arrayList
    void addEdge(T u,T v,boolean directed){
        list.get((Integer) u).add(v);

        if (!directed)
        list.get((Integer) v).add(u);

    }

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
