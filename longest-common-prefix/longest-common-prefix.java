class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];
        
        int idx = 0;
        String ans = "";
        
        while(true){
            
            if(strs[0].length() == idx)
                break;
            char tmp = strs[0].charAt(idx);
            int cnt = 1; 
            for(int i = 1 ; i< strs.length ; i++){
                if(strs[i].length() == idx)
                    break;
                if(tmp == strs[i].charAt(idx)){
                    cnt++;
                }else
                    break;
            }
            if(cnt == strs.length)
                ans+= tmp;
            else
                break;
            idx++;
        }
        
        return ans;
        
        
        

    }
}