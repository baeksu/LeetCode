import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for(int i = 0 ; i< strs.length ; i++){
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String tmp2 = new String(tmp);

            if(map.containsKey(tmp2)){
                map.get(tmp2).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(tmp2,list);
            }
                    
        }
        
        List<List<String>> ans = new ArrayList<>();
        
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;       
      
    }
}