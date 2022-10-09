class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        cnt = 0
        for i in range(0,len(nums)):
            if nums[i] == 0:
                cnt+=1
                continue
            
            tmp = nums[i-cnt]
            nums[i-cnt] = nums[i]
            nums[i] = tmp