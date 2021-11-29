class Solution {
    public String addStrings(String num1, String num2) {
        
        int firstLength = num1.length()-1;
        int secondLength = num2.length()-1;
        int carry = 0;
        int tmp = 0;
        String ans = "";
        while(firstLength >= 0 || secondLength >= 0){
            int a = 0;
            int b = 0;
            if(firstLength >= 0){
                a = num1.charAt(firstLength) - '0';
            }
            
            if(secondLength >=  0){
                b = num2.charAt(secondLength) - '0';
            }
            
            int sum = carry + a + b;
            if(sum >= 10){
                carry = 1;
                tmp = (sum)%10;
            }else{
                carry = 0;
                tmp = sum;
            }
            ans = (char)(tmp + '0') + ans;
            
            //System.out.println(ans);
            
            firstLength--;
            secondLength--;
        }
        
        if(carry == 1){
            ans = (char)(1 + '0') + ans;
        }
        
        
        return ans;
    }
}