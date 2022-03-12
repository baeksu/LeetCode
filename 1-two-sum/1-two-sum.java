

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> store = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0 ; i< nums.length ; i++){
            if(store.containsKey(target - nums[i])){
                ans[0] = store.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            
            store.put(nums[i],i);
        }
        
        return ans;
        
    }
}