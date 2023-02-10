import java.util.*;

class Solution {
    private static int[][] visited;
    
    public int maxDistance(int[][] grid) {
        int ans = -1;
        visited = new int[grid.length][grid.length];
        for(int i = 0 ; i< grid.length ; i++){
            for(int j = 0 ; j< grid[i].length ; j++){
                if(grid[i][j] == 0) continue;
                bfs(grid.length , i,j,grid);
            }
        }
        
        for(int i = 0 ; i< grid.length ; i++){
            for(int j = 0 ; j< grid[i].length ; j++){
                if(grid[i][j] == 1) continue;
                ans = Math.max(ans,visited[i][j]);
            }
        }
        
        return ans == -1 ? -1 : ans-1;
    }
    
    private static void bfs( int N, int sy, int sx, int[][] grid){
        Queue<Node> q = new LinkedList<>();
        
        q.add(new Node(sy,sx));
        visited[sy][sx] = 1;
        
        int[] dy= {0,0,1,-1};
        int[] dx = {1,-1,0,0};
        
        while(!q.isEmpty()){
            int cy = q.peek().y;
            int cx = q.peek().x;
            int curDist = visited[cy][cx];
            q.poll();
            
            for(int dir = 0 ; dir <4 ; dir++){
                int ny = cy + dy[dir];
                int nx = cx + dx[dir];
                
                if(ny < 0 || nx < 0 || ny >=N || nx >=N) continue;
                if(grid[ny][nx] == 1) continue;
                if(visited[ny][nx] != 0 && visited[ny][nx] <= curDist+1 ) continue;
                
                visited[ny][nx] = curDist+1;
                
                q.add(new Node(ny,nx));
            }
        }
    }
    
    private static class Node{
        int y;
        int x;
        Node(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
}