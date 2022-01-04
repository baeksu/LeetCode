class Solution {
    public int bitwiseComplement(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        if(n == 0)
            return 1;
        
        while(n > 0){
            if(n % 2 == 0){
                arrayList.add(0);
            }else{
                arrayList.add(1);
            }
            n = n/2;
        }
        
        int ans = 0;
        for(int i = 0 ; i< arrayList.size() ; i++){
            if( arrayList.get(i) == 0){
                ans += Math.pow(2 , i);
            }
        }
        
        return ans;
    }
}