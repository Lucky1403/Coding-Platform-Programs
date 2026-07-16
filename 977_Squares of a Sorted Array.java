class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int squaredNumber[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            nums[i] = nums[i] * nums[i];
        }

        int leftPointer = 0;
        int rightPointer = n - 1;
        int index = n - 1;

        while(leftPointer <= rightPointer)
        {
            if(nums[leftPointer] > nums[rightPointer])
            {
                squaredNumber[index] = nums[leftPointer];
                leftPointer++;
            }
            else
            {
                squaredNumber[index] = nums[rightPointer];
                rightPointer--;
            }

            index--;
        }
        return squaredNumber;
    }
}