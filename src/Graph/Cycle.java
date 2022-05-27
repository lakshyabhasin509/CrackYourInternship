package Graph;
import java.util.*;


public class Cycle {

    public boolean detectCycleBFS(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    int n = q.poll();
                    set.add(n);
                    for (int j : adj.get(n)) {

                        if (!vis[j]) {
                            q.add(j);
                            vis[j] = true;
                        } else if (!set.contains(j)) return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean detectCycleDFSUndirected(int V, ArrayList<ArrayList<Integer>> adj) {
        {
            boolean vis[]=new boolean[V];

            for (int i = 0; i < V; i++) {
                if (!vis[i]){
                    if(DFSCycle(i,adj,vis,-1))return true;
                }
            }

            return false;
        }
    }

    private boolean DFSCycle(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent) {
        vis[v]=true;

        for (int i:adj.get(v)) {
            if (!vis[i]){
                return DFSCycle(i,adj,vis,v);
            }
            else if (i!=parent)return true;

        }

    return false;
    }
    public boolean detectCycleDFSDirected(int V, ArrayList<ArrayList<Integer>> adj)
        {
            boolean vis[] = new boolean[V];
            HashSet<Integer> parent=new HashSet<>();

            for (int i = 0; i < V; i++) {
                if (!vis[i]) {
                    if (DFSCycleDirected(i, adj, vis, parent)) return true;
                }
            }

            return false;
        }
        public boolean DFSCycleDirected(int v, ArrayList<ArrayList<Integer>> adj,
                                        boolean[] vis, HashSet<Integer> parent){
            vis[v]=true;
            parent.add(v);
            for (int i:adj.get(v)) {
                if (!vis[i]){
                    if(DFSCycleDirected(i,adj,vis,parent))return true;
                }
                else if (parent.contains(i))return true;

            }
            parent.remove(v);
        return false;
        }

    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n= sc.nextInt();
                int m= sc.nextInt();
                Graph<Integer> g= new Graph<Integer>(n);
                for (int i = 0; i < m; i++) {
                    int u= sc.nextInt();
                    int v= sc.nextInt();

                    g.addEdge(u,v,true);
                }
                ArrayList<ArrayList<Integer>> list=g.getList();
                System.out.println(list);
                Cycle c=new Cycle();
                System.out.println( c.detectCycleDFSDirected(n,list));

            }
           public boolean detectCycleDisjointSet(int V, ArrayList<ArrayList<Integer>> adj){

        return false;
           }
    }
