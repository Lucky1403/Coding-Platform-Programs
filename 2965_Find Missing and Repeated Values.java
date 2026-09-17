import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        int size = grid.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int element = grid[i][j];
                map.put(element, map.getOrDefault(element, 0) + 1);
                set.add(element);
            }
        }

        int[] result = new int[2];

        for (int i = 1; i <= size * size; i++) {
            if (!set.contains(i))
                result[1] = i;
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1)
                result[0] = key;
        }

        return result;
    }
}