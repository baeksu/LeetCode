class Solution {
    public void sortColors(int[] nums) {
        
        int[] colors = {0,0,0};
        for(int i = 0 ; i< nums.length ; i++){
            colors[nums[i]]++;
        }
        
        int idx = 0;
        for(int i = 0 ; i< nums.length ; i++){
            while(colors[idx] == 0 )
                idx++;
            nums[i] = idx;
            colors[idx]--;
            
        }
        
        
    }
}