class Solution {

    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(i, graph, visited);
                count++;
            }
        }

        return count;
    }

    public void bfs(int source, List<List<Integer>> graph, boolean[] visited){

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(source);
        visited[source] = true;

        while(!q.isEmpty()){
            int curren = q.poll();

            for(int nei : graph.get(curren)){
                if(!visited[nei]){
                    visited[nei] = true;
                    q.offer(nei);
                }
            }
        }
    }
}