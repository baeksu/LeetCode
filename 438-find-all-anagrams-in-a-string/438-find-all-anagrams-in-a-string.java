import java.util.ArrayList;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int[] pCheck = new int[30];       
        for(int i = 0 ; i< p.length() ; i++){
            pCheck[p.charAt(i) - 'a']++;
        }
        
        int[] sCheck = new int[30];
        for(int i = 0 ; i< s.length() ; i++){
            if(pCheck[s.charAt(i) - 'a'] != 0){
                sCheck = new int[30];
                
                if(i+p.length() > s.length()) break;
                for(int j = i ; j< i + p.length() ; j++){
                    if(pCheck[s.charAt(j) - 'a'] == 0 ) break;
                    
                    sCheck[s.charAt(j) - 'a']++;
                    if(sCheck[s.charAt(j) - 'a'] > pCheck[s.charAt(j) - 'a'] ) break;
                    
                    if(j == i + p.length()-1)
                        ans.add(i);
                }
            }        
        }
    
        return ans;
    }
}