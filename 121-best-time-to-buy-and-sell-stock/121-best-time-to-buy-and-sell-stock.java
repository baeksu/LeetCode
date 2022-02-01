class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        
        int buyPrice = prices[0];
        int ans = 0;
        for(int i = 1 ; i< prices.length ; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
                continue;
            }
            
            if(prices[i] - buyPrice > ans ){
                ans = prices[i] - buyPrice;
            }
        }
        
        return ans;
    }
}