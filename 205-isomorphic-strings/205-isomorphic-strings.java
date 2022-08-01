class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] visited1 = new int[300];
        int[] visited2 = new int[300];
        
        for(int i = 0 ; i< s.length() ; i++){
            int sIdx = s.charAt(i);
            int tIdx = t.charAt(i);
            
            if(visited1[sIdx] == visited2[tIdx]){
                if(visited1[sIdx] == 0){
                    visited1[sIdx] = i+1;
                    visited2[tIdx] = i+1;
                }
            }else{
                return false;
            }
        }
        
        return true;
    }
}