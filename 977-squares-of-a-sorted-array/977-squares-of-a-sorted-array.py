class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ans = [0 for _ in range(len(nums))]
        left = 0
        right = len(nums) - 1
        idx = len(nums)
        while left <= right:
            idx-=1
            if abs(nums[left]) > abs(nums[right]):
                ans[idx] = nums[left]**2
                left+=1
            else:
                ans[idx] = nums[right]**2
                right-=1
        return ans
        
        
        
        