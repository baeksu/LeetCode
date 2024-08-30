/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
        let max_profit = 0;
        for(let i = 0 ; i< prices.length ; i++){
            if (prices[i] > prices[i-1]){
                max_profit += prices[i] - prices[i-1]
            }
        }
        return max_profit;
    }

//1. 현재 주식이 없으면 그날 주식을 일단 산다
//2. 근데 다음날 주식이 하락한다면 이미 산 주식을 당일에 팔고 그 다음날 주식을 산다
//3. 주식이 다음날 상승할 때 까지 가지고 있는다.