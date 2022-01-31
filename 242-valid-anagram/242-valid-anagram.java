class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] visit = new int[30];
        
        for(int i = 0 ; i< s.length() ; i++){
            visit[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i< t.length() ; i++){
            visit[t.charAt(i) - 'a']--;
            if(visit[t.charAt(i) - 'a'] <0) return false;
        }
        
        return true;
    }
}