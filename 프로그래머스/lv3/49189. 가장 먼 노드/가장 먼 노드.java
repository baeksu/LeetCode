import java.util.*;

class Solution {
    private static int[] visited;
    public int solution(int n, int[][] edge) {
        
        visited = new int[n+1];
        List<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i<= n ; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i< edge.length ; i++){
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        
        int ans = bfs(graph,n);
        
        
        
        return ans;
    }
    
    private static int bfs(List<ArrayList<Integer>> graph,int N){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        
        visited[1] = 1;
        int maxDist = 0;
        int ans = 0;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            int dist = visited[cur];
            
            for(int i = 0 ; i< graph.get(cur).size() ; i++){
                int next = graph.get(cur).get(i);
                if(visited[next] != 0) continue;
                visited[next] = dist + 1;
                
                
                //같다면 ans++ 시켜준다.
                if(maxDist == visited[next]){
                    ans++;
                }else if(maxDist < visited[next]){
                    ans = 1;
                    maxDist = visited[next];
                }else{
                    
                }
                
                
                
                q.add(next);
            }
        }
        
        return ans;
    }
    
    private static class Node{
        int next;
        int dist;
        Node(int next, int dist){
            this.next = next;
            this.dist = dist;
        }
    }
    
    
}