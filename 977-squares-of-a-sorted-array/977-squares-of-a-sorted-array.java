class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int front = 0;
        int rear = nums.length - 1;
        int[] ans = new int[nums.length];
        int idx = nums.length - 1;
        while(front <= rear){
            if(Math.abs(nums[front]) < Math.abs(nums[rear])){
                ans[idx--] = nums[rear] * nums[rear];
                rear--;
            }else{
                ans[idx--] = nums[front] * nums[front];
                front++;
            }
        }
        
        
        return ans;
        
    }
}