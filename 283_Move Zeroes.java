class Solution {
    public void Swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        
        int left = 0;

        int n = nums.length;

        if(n == 1)
        {
            return;
        }

        for(int right = 0; right < n; right++)
        {
            if (nums[right] != 0) {
                Swap(nums, left, right);
                left++;
            }
        }
    }
}