import java.util.*;

class Solution {
    private static int ans;
    public int solution(int n, int[][] wires) {
        ans = 987654321;
        List<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i<=n ; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i< wires.length ; i++){
            graph.get(wires[i][0]).add(wires[i][1]);
            graph.get(wires[i][1]).add(wires[i][0]);
        }
        
        solve(wires,graph,n);
        
        return ans;
    }
    
    private static void solve(int[][] wires,List<ArrayList<Integer>> graph,int n  ){
        for(int i = 0 ; i< wires.length ; i++){
            bfs(graph, n, wires[i][0],wires[i][1]);
        }
        
    }
    
    private static void bfs(List<ArrayList<Integer>> graph,int n ,int from, int dest){
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[101];
        int cnt = 1;//몇개의 노드가 연결되어 있는지
        visited[1] = 1;
        q.add(1);// 1번 노드부터 bfs 를 돌릴거다.
        
        while(!q.isEmpty()){
            int cur = q.poll();
            // System.out.println(cur);
            for(int i = 0 ; i< graph.get(cur).size() ; i++){
                int next = graph.get(cur).get(i);
                if(next == from && cur == dest) continue;
                if(next == dest && cur == from) continue;
                if(visited[next] !=0) continue;
                cnt++;
                visited[next] = 1;
                q.add(next);
            }
        }
        // System.out.println("-----------");
        
        ans = Math.min(ans,Math.abs(n-cnt-cnt));
        
        
    }
}