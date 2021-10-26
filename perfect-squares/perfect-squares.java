
class Solution {
    public int numSquares(int n) {
        
        int[] dp = new int[10001];
        Arrays.fill(dp,987654321);
        dp[0] = 0;
        
        for(int i = 1 ; i<= 10000 ; i++){
            int j = 1;
            while(i-j*j >= 0 ){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
                j++;
            }
        }
        
        
        
        return dp[n];
    }
}