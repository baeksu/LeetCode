class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        
        for(int n1 : nums1){
            for(int n2 : nums2){
                map.compute(n1+n2, (k,v)->(v==null)?1:v+1);
            }
        }
        
        for(int n3 : nums3){
            for(int n4 : nums4){
                ans += map.getOrDefault(-(n3+n4), 0);
            }
        }
        
        return ans;
        
    }
}