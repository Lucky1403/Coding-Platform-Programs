import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        if(nums == null || nums.length == 0)
        {
            return new ArrayList<>();
        }
        HashSet<Integer> set = new HashSet<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }

            if(nums[i] < min)
            {
                min = nums[i];
            }

            set.add(nums[i]);
        }

        ArrayList<Integer> l1 = new ArrayList<>();

        for(int i = min; i < max; i++)
        {
            if(!set.contains(i))
            {
                l1.add(i);
            }
        }

        return l1;
    }
}