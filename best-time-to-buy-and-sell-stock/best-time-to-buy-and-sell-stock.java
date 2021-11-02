/*
1.이전보다 작은수가 나오면 무조건 그 수를 선택하는게 이득이다. 
이후에 나오는 큰값과의 차이가 더 커지니까

2.선택한 값과 인덱스를 옮기면서 나오는 값들의 차이를 계속 비교
*/

class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int ans = 0;
        
        for(int i = 1 ; i< prices.length ; i++){
            if(prices[i] < prices[start]){
                start = i;
            }else if(prices[i] > prices[start]){
               if(ans < prices[i] - prices[start] ){
                   ans = prices[i] - prices[start];
               } 
            }
            
        }
        
        return ans;
    }
}
