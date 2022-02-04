import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int sum = 0;
        int ans = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == 0){
                sum = sum-1;
            }
            else {
                sum = sum +1;
            }
                
            //이미 map 에 값이 있으면 갱신
            if(map.containsKey(sum)){
                ans = Math.max(ans , i - map.get(sum));
            }
            else{
                map.put(sum,i);
            }
            
            
        }
        return ans;
    }
}