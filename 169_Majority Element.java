class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;

        for(int i = 0; i < nums.length; i++)
        {
            if(count == 0)
            {
                candidate = nums[i];
                count++;
            }
            else
            {
                if(candidate == nums[i])
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
        }

        count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == candidate)
            {
                count++;
            }
        }

        if(count > (nums.length / 2))
        {
            return candidate;
        }

        return -1;
    }
}