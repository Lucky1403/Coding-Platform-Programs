import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1)
        {
            set.add(num);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums2)
        {
            set2.add(num);
        }

        for(int ele : set)
        {
            if(set2.contains(ele))
                list.add(ele);
        }

        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }

        return arr;
    }
}