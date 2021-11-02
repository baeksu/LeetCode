class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = -1;
        int ans = 0;
        
        for(int i = 1 ; i< prices.length ; i++){
            if(prices[i] < prices[start]){
                start = i;
            }else if(prices[i] > prices[start]){
               if(ans < prices[i] - prices[start] ){
                   end = i;
                   ans = prices[i] - prices[start];
               } 
            }
            
        }
        
        return ans;
    }
}