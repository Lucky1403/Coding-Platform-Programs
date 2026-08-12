class Solution {
    public int maximumCount(int[] nums) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        int low = 0;
        int high = nums.length - 1;
        //for finding the negative numbers 
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] < 0) {
                low = mid+ 1;
            } else {
                high = mid - 1;
            }
        }
        negativeNumbers = low;

        low = 0;
        high = nums.length - 1;
        //for finding the positive numbers 
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        positiveNumbers = nums.length - low;

        return Math.max(positiveNumbers, negativeNumbers);
    }
}