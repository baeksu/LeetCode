import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer>[] bucket = new List[nums.length+1];
        List<Integer> ans = new ArrayList<Integer>();
        
        //map 에다가 nums 의 원소들이 몇번 등장했는지 put
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        //map key:value 를 확인하면서 value -> key1, key2... 이런식으로 저장해야함
        for(int key : map.keySet()){
            if(bucket[map.get(key)] == null){
                bucket[map.get(key)] = new ArrayList<Integer>();
            }
            bucket[map.get(key)].add(key);
        }
        
        //bucket 의 뒷부분 부터 ans 에 추가해 준다.
        for(int i = bucket.length - 1 ; i >=0 && ans.size() < k; i--){
            if(bucket[i] != null ){
                ans.addAll(bucket[i]);
            }
        }
        
        int[] res = new int[ans.size()];
        for(int i = 0 ; i< ans.size() ; i++){
            res[i] = ans.get(i);
        }
        
        return res;
    }
}