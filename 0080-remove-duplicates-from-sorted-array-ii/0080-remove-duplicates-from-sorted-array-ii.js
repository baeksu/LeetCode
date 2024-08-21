/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let curIdx = 2;
    for(let i = 2 ; i< nums.length ; i++){
        if(nums[i] != nums[curIdx-2]){
            nums[curIdx++] = nums[i]
        }
    }

    return curIdx;
};