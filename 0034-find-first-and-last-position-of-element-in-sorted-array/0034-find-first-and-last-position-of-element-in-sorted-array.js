/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let left = 0;
    let right = nums.length - 1;
    let start = -1;
    let end   = -1;
    
    while(left <= right){
        let mid = parseInt(left + (right - left) / 2);
        if(nums[mid] == target){  
          start = mid;
          end = mid;
          while (nums[start - 1] === target) {
            start -= 1;
          }
          while (nums[end + 1] === target) {
            end += 1;
          }
          return [start, end];
        }else if(nums[mid] > target){
            right = mid-1;
        }else if(nums[mid] < target){
            left = mid+1;
        }
    }
    
    
    return [start,end];
};