import java.util.HashSet;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }

        int number = 1;
        for(int i = 1; i <= nums.length + 1; i++)
        {
            number = k * i;
            if(!set.contains(number))
            {
                break;
            }
        }
        return number;
    }
}