import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    class Pair{
        int value;
        int index;

        Pair(int value, int index)
        {
            this.value = value;
            this.index = index;    
        }
    }
    
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int num : nums)
        {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Pair> list = new ArrayList<>();
        int count = 0;
        for(int key : map1.keySet())
        {
            if(map1.get(key) == 3)
            {
                for(int i = 0; i < nums.length; i++)
                {
                    if(nums[i] == key)
                    {
                        list.add(new Pair(key, i));
                    }
                }

                if(list.size() == 3)
                {
                    int diff1 = list.get(1).index - list.get(0).index;
                    int diff2 = list.get(2).index - list.get(1).index;

                    if(diff1 == diff2)
                    {
                        count++;
                    }
                    list.clear();
                }
            }
        }
        return count;
    }
}