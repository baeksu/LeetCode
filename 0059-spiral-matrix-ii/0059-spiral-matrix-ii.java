class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] ans = new int[n][n];
        
        int num = 1;
        int left = 0;
        int right = n-1;
        int up = 0;
        int down = n-1;
        
        while(num <= n*n){
            
            //left to right
            for(int i = left ; i<= right ; i++){
                ans[up][i] = num++;
            }
            up++;
            
            for(int i = up ; i<= down ; i++){
                ans[i][right] = num++;
            }
            right--;
            
            for(int i = right ; i>= left ; i--){
                ans[down][i] = num++;
            }
            down--;
            
            for(int i = down ; i>= up ; i--){
                ans[i][left] = num++;
            }
            left++;
        }
        
        
        
        return ans;
    }
}