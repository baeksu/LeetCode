class Solution {
    public int bitwiseComplement(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        if(n == 0)
            return 1;
        
        int ans = 0;
        int cnt = 0;
        while(n > 0){
            if( n%2 == 0){
                ans += Math.pow(2 , cnt);
            }
            cnt++;
            n = n/2;
        }

        
        return ans;
    }
}