import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*
        1. 정렬
        2. val = 1 부터 시작
        3. 맨처음에 1부터 시작해야하는데 2가 있다? -> ans에 1 추가 val++
        4. val 보다 작은값이 나오면 pass 큰값을 만나면 해당값은 없는거다. val++
        */
        
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        
        int val = 1;
        for(int i = 0 ; i< nums.length ; i++){
            if(val > nums[i]){
                continue;
            }else if(val == nums[i]){
                val++;
            }else if (val < nums[i]){
                ans.add(val++);
                i--;
            }
        }
        
        for(int i = val ; i <= nums.length ; i++){
            ans.add(i);
        }
        
        
        return ans;
        
    }
}