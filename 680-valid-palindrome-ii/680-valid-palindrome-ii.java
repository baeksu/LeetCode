class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        int prevLeft = 0;
        int prevRight = 0;
        boolean flag = true;
        boolean flag2 = true;
        
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                if(flag){
                    prevLeft = left;
                    prevRight = right;
                    right--;
                    flag= false;
                }else{
                    if(flag2 == true){
                        left = prevLeft+1;
                        right = prevRight;
                        flag2 = false;
                    }else{
                        return false;    
                    }
                    
                }
            }else{
                left++;
                right--;
            }
        }
        
        return true;
    }
}