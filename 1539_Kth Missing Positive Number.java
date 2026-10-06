import java.util.HashSet;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length; i++)
            set.add(arr[i]);

        int[] missingNumbers = new int[k];
        int idx = 0;
        for(int i = 1; i <= 1000 + k; i++)
        {
            if(!set.contains(i))
                missingNumbers[idx++] = i;
            
            if(idx == k)
                break;
        }
        return missingNumbers[k-1];
    }
}