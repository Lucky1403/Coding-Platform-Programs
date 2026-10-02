import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int duplicate = -1;
        int missing = -1;

        for(int key : map.keySet())
        {
            if(map.get(key) == 2)
            {
                duplicate = key;
            }
        }

        for(int i = 1; i <= nums.length; i++)
        {
            if(!map.containsKey(i))
            {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}