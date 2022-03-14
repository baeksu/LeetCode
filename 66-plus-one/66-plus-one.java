class Solution {
    public int[] plusOne(int[] digits) {
        
        int carryNum = 0;
        
        
        for(int i = digits.length - 1 ; i >=0 ; i--){
            int newNum = digits[i] + carryNum;
            
            //맨끝에 자리에만 +1 을 해주자
            if(i == digits.length - 1){
                newNum+=1;
            }
            
            if(newNum>=10){
                digits[i] = newNum - 10;
                carryNum = 1;
            }else{
                digits[i] = newNum;
                carryNum = 0;
            }
        }
        
        if(carryNum == 1){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            for(int i = 0 ; i< digits.length ; i++ ){
                ans[i+1] = digits[i];
            }
            return ans;
        }
        
        return digits;
    }
}