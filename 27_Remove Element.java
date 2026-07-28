class Solution {

    public int removeElement(int[] nums, int val) {
        if(nums.length == 0)
        {
            return 0;
        }
        
        int i = 0;
        int n = nums.length - 1;

        while (i <= n) {
            if (nums[i] == val) {
                nums[i] = nums[n];
                n--;
            } else {
                i++;
            }
        }

        return i;
    }
}