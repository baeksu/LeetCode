class Solution {
    public int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        
        int prev = nums[nums.length-1];
        int cnt = 1;
        
        for(int i = nums.length - 2 ; i>=0  ; i --){
            if(prev == nums[i]){
                continue;
            }else{
                prev = nums[i];
                cnt++;
                
            }
            
            if(cnt==3){
                break;
            }
            
        }
        if(cnt!=3){
            return nums[nums.length-1];
        }else{
            return prev;    
        }
        
        
    }
}