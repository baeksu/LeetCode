class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for(int j = 1 ; j< nums.length ; j++){
            if(nums[j] == nums[j-1]) continue;
            
            nums[idx++] = nums[j];
        }
        return idx;
        
    }
}