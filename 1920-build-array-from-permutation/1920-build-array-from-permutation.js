/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
    const ans = [];
    
    nums.forEach((i) =>{
        ans.push(nums[i]);
    })
    
    
    return ans;
    
};