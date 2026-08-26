import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    class Triplet implements Comparable<Triplet>{
        int idx;
        int ModulusValue;
        int value;

        Triplet(int idx, int ModulusValue, int value)
        {
            this.idx = idx;
            this.ModulusValue = ModulusValue;
            this.value = value;
        }

        public int compareTo(Triplet t)
        {
            if(this.ModulusValue == t.ModulusValue)
            {
                return Integer.compare(this.value, t.value);
            }
            return Integer.compare(this.ModulusValue, t.ModulusValue);
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < arr.length; i++)
        {
            int modValue = Math.abs(arr[i] - x);
            pq.add(new Triplet(i, modValue, arr[i]));
            if(pq.size() > k)
            {
                pq.remove();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size() > 0)
        {
            Triplet t = pq.remove();
            ans.add(t.value);
        }
        
        Collections.sort(ans);
        return ans;
    }
}