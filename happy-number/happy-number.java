class Solution {
    public boolean isHappy(int n) {
        
        Map<Integer,Integer> store = new HashMap<>();
        
        while(!store.containsKey(n)){
            store.put(n , 1);
            
            int tmp = 0;
            while(n!=0){
                tmp += Math.pow(n%10,2);
                n= n/10;
            }
            
            if(tmp == 1)
                return true;
            else
                n = tmp;

        }
        
        return false;
        
    }
}