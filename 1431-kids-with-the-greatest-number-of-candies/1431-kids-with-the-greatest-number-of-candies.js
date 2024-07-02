/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    const ans = [];
    let maxCandiesCount = -1;
    for(let i = 0 ; i< candies.length ; i++){
        if(maxCandiesCount < candies[i]){
            maxCandiesCount = candies[i];
        }
        if(candies[i] + extraCandies >= maxCandiesCount){
            ans.push(true);
        }else{
            ans.push(false);
        }
    }
    return ans;
};