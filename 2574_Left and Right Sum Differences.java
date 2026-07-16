class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        
        int answer[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            totalSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            rightSum = totalSum - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return answer;
    }
}