import java.io.*;
import java.util.*;

public class prim_algo {

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static class Pair {

        int v;
        int av;
        int wt;

        Pair(int v, int av, int wt) {

            this.v = v;
            this.av = av;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,-1,0));
        boolean[] visited = new boolean[vtces];

        while(pq.size()!=0){

            Pair rm = pq.remove();

            if(visited[rm.v])
            continue;

            visited[rm.v] = true;

            if(rm.av!=-1)
            System.out.println("["+rm.v+"-"+rm.av+"@"+rm.wt+"]");

            for(Edge e : graph[rm.v]){

                if(!visited[e.nbr])
                pq.add(new Pair(e.nbr,rm.v,e.wt));
            }
                   
        }
    }

}