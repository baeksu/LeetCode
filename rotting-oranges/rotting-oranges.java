import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        
        int height = grid.length;
        int width = grid[0].length;
        int countOne = 0;
        int ans = 0;
        int[] dirs = {0,1,0,-1,0};
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0 ; i< height ; i++){
            for(int j = 0 ; j< width ; j++){
                if(grid[i][j] == 1){
                    countOne++;
                }else if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
            
                }
            }
        }
        
        int time = 0;
        while(!q.isEmpty()){
            time++;     
            int qsize = q.size();
            for(int i = 0 ; i< qsize ;i++){
                int[] cur = q.poll();

                for(int dir = 0 ; dir <4 ; dir++){
                    int ny = cur[0] + dirs[dir];
                    int nx = cur[1] + dirs[dir+1];

                    if(ny < 0 || nx <0 || ny >= height || nx >= width) continue;
                    if(grid[ny][nx] == 0 || grid[ny][nx] == 2) continue;

                    grid[ny][nx] = 2;
                    q.add(new int[]{ny,nx});
                    countOne--;

                }
            }
            

        }

        if(countOne == 0){
            if(time == 0) 
                return 0;
            return time-1;
        }
        
        return -1;
        

 
        
       
    }
    

    
}