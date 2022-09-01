class Solution {
    public int findDuplicate(int[] nums) {
        int visited[] = new int[100001];
        
        for(int i = 0 ; i< nums.length ; i++){
            if(visited[nums[i]] == 1){
                return nums[i];
            }else{
                visited[nums[i]] += 1;
            }
        }
        
        return -1;
    }
}