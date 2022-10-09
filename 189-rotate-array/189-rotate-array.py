class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ans = [ 0 for i in range(len(nums))]
        
        for idx in range(len(nums)-1,-1,-1):
            ans[(idx+k)%len(nums)]=nums[idx]
        
        for i in range(len(nums)):
            nums[i] = ans[i]