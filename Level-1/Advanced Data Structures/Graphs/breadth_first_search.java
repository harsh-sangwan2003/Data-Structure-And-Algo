import java.io.*;
import java.util.*;

public class breadth_first_search {

    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static class Pair {

        int v;
        String psf;

        Pair(int v, String psf) {

            this.v = v;
            this.psf = psf;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());

        // write your code here
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + ""));
        boolean[] visited = new boolean[vtces];

        while (q.size() != 0) {

            Pair rm = q.remove();

            if (visited[rm.v])
                continue;

            visited[rm.v] = true;
            System.out.println(rm.v + "@" + rm.psf);

            for (Edge e : graph[rm.v]) {

                if (!visited[e.nbr]) {

                    q.add(new Pair(e.nbr, rm.psf + e.nbr));
                }
            }
        }
    }
}