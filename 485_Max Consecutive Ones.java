class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int MaxCount = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                result++;
                if(result > MaxCount)
                {
                    MaxCount = result;
                }
            }
            else
            {
                result = 0;
            }
        }

        return MaxCount;
    }
}