class Solution {
    public int maxSubArray(int[] nums) {
     
        int ans = nums[0];
        int calc = nums[0];
        for(int i = 1 ; i< nums.length ; i ++){
            if(nums[i] + calc < nums[i]){
                System.out.println(i + " " + nums[i]);
                calc = nums[i];
            }else{
                calc += nums[i];
            }
            
            if(calc > ans ) 
                ans = calc;
        }
        
        return ans;
    }
}