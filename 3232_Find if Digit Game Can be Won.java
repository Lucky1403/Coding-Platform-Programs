class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int singleDigitNumberSum = 0, doubleDigitNumberSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 9)
            {
                doubleDigitNumberSum += nums[i];
            }
            else
            {
                singleDigitNumberSum += nums[i];
            }
        }

        if(Math.abs(doubleDigitNumberSum - singleDigitNumberSum) == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}