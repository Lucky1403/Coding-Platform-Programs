import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int[] arr : nums) {
            HashSet<Integer> set = new HashSet<>();

            for (int num : arr) {
                if (!set.contains(num)) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    set.add(num);
                }
            }
        }

        for (int num : map.keySet()) {
            if (map.get(num) == nums.length) {
                ans.add(num);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}