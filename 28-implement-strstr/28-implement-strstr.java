class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.length() < needle.length()){
            return -1;
        }
        
        if(haystack.equals(needle)){
            return 0;
        }
        
        if(needle.length() == 0){
            return 0;
        }
        
        
        for(int i = 0 ; i< haystack.length() ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                // 만약 haystack 에 남아있는 문자열 보다 needle이 더 크다면 return -1
                if(i+needle.length() > haystack.length()){
                    return -1;
                }
                
                for(int j = 0 ; j< needle.length() ; j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)) break;
                    
                    if(j == needle.length()-1){
                        return i;
                    }
                } 
                
            }
        }
        
        return -1;
    }
}