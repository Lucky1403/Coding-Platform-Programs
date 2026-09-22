class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            int sum = 0;
            while(nums[i] > 0)
            {
                sum += nums[i] % 10;
                nums[i] /= 10;
            }

            nums[i] = sum;
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        return min;
    }
}