import java.util.*;

class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        
        int ans = 0;
        for(int i = 0 ; i< nums.length ;){
            ans++;
            int dist = nums[i];
            int nextIdx = i+1;
            int nextDist = 0;
            for(int j = i+1 ; j<=i+dist ; j++){
                if(j >= nums.length-1) return ans;
                nextDist = Math.max( nextDist, j+nums[j]);
                if(nextDist == j+nums[j]) nextIdx = j;
            }
            
            i = nextIdx;
        }
        
        return ans;
    }
}