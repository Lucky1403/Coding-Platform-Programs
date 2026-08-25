import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    class Pair implements Comparable<Pair> {
        int frequency;
        int element;

        Pair(int frequency, int element) {
            this.frequency = frequency;
            this.element = element;
        }

        public int compareTo(Pair p) {
            if (this.frequency == p.frequency) {
                return Integer.compare(this.element, p.element);
            }
            return Integer.compare(this.frequency, p.frequency);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer element = entry.getKey();
            Integer frequency = entry.getValue();
            pq.add(new Pair(frequency, element));
            if(pq.size() > k)
            {
                pq.remove();
            }
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++)
        {
            Pair p = pq.remove();
            ans[i] = p.element;
        }
        return ans;
    }
}