class Solution {
    public int countOdds(int low, int high) {
        int ans = 0;
        if(low%2 == 1){
            ans++;
            low++;
        }
        
        if(high%2 == 1){
            ans++;
            high--;
        }
        
        int diff = high-low;
        return diff/2 + ans;
        
    }
}