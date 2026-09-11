import java.util.HashMap;

class Solution {
    public int totalNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < digits.length; i++)
        {
            map.put(digits[i], map.getOrDefault(digits[i],0)+1);
        }

        int totalEvenNumbers = 0;
        for (int i : map.keySet()) {
            if (i == 0) continue;

            for (int j : map.keySet()) {
                for (int k : map.keySet()) {
                    if (k % 2 != 0) continue;

                    map.put(i, map.get(i) - 1);
                    map.put(j, map.get(j) - 1);
                    map.put(k, map.get(k) - 1);

                    if (map.get(i) >= 0 && map.get(j) >= 0 && map.get(k) >= 0) {
                        totalEvenNumbers++;
                    }

                    map.put(i, map.get(i) + 1);
                    map.put(j, map.get(j) + 1);
                    map.put(k, map.get(k) + 1);
                }
            }
        }
        return totalEvenNumbers;
    }
}