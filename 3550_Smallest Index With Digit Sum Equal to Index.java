class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            int digitSum = 0;
            while(nums[i] > 0)
            {
                digitSum += nums[i] % 10;
                nums[i] /= 10;
            }

            if(digitSum == i)
            {
                return i;
            }
        }
        return -1;
    }
}