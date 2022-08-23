import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solution(0,list,candidates,target,0,ans);
        
        return ans;
    }
    
    public static void solution(int start, List<Integer> list , int[] candidates, int target, int sum, List<List<Integer>> ans){
                
        if(sum >= target){
            if(sum == target){       
                List<Integer> result = new ArrayList<>();
                
                for(int i = 0 ; i< list.size() ; i++){
                    result.add(list.get(i));
                }
                
                ans.add(result);

            }
            return;
        }
        
        for(int i = start ; i< candidates.length ; i++){
            list.add(candidates[i]);
            solution(i,list,candidates,target,sum + candidates[i], ans );
            list.remove(list.size()-1);
                
        }
        
    }
}