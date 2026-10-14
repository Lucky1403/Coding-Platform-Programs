import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] greaterArray;
        int[] smallerArray;
        if(size1 > size2)
        {
            greaterArray = nums1;
            smallerArray = nums2;
        }
        else
        {
            greaterArray = nums2;
            smallerArray = nums1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < greaterArray.length; i++)
            map.put(greaterArray[i], map.getOrDefault(greaterArray[i], 0) + 1);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < smallerArray.length; i++)
        {
            if (map.getOrDefault(smallerArray[i], 0) != 0)
            {
                int currentValue = map.get(smallerArray[i]);
                map.put(smallerArray[i], currentValue - 1);
                list.add(smallerArray[i]);
            }
        }

        int[] answer = new int[list.size()];
        int idx = 0;
        for(int x : list)
            answer[idx++] = x;

        return answer;
    }
}