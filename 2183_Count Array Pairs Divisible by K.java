import java.util.*;

class Solution {
    public long gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public long countPairs(int[] nums, int k) {
        long answer = 0;
        HashMap<Long, Long> map = new HashMap<>();
        for (int num : nums) {
            long gcdNum = gcd(num, k);
            map.put(gcdNum, map.getOrDefault(gcdNum, 0L) + 1);
        }

        for (Long g1 : map.keySet()) {
            for (long g2 : map.keySet()) {
                if ((g1 * g2) % k == 0) {
                    if (g1.equals(g2)) {
                        long c = map.get(g1);
                        answer += c * (c - 1);
                    }
                    else
                        answer += map.get(g1) * map.get(g2);
                }
            }
        }
        return (long) (answer / 2);
    }
}