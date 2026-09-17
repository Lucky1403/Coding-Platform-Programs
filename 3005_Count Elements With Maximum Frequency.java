import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,LinkedHashMap::new));

        int result = 0;
        int maxKey = Integer.MIN_VALUE;
        for(int key : sortedMap.keySet())
        {
            if(maxKey <= map.get(key))
            {
                maxKey = map.get(key);
                result += map.get(key);
            }
        }

        return result;
    }
}