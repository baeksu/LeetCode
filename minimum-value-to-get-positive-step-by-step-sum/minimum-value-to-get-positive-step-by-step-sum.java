/*
    이전 + 현재가 만약 1보다 작으면 1을 만들어 주는 값 + 이전값
*/


class Solution {
    public int minStartValue(int[] nums) {
        int prev = 1;
        int ans = 1;
        for(int i = 0 ; i< nums.length ; i++){
            int step = prev + nums[i];    
            if (step < 1 ){
                    prev = 1;
                    ans += (1-step);
            }else{
                prev = step;
            }
        }
            
        return ans;
    }
}