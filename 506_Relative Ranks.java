import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        int[] dummy = new int[n];
        for(int i = 0; i < n; i++)
        {
            dummy[i] = score[i];
        }

        HashMap<Integer, String> map = new HashMap<>();
        Arrays.sort(dummy);
        for(int i = n - 1; i >= 0; i--)
        {
            if(i == n-1)
                map.put(dummy[i], "Gold Medal");
            else if(i == n - 2)
                map.put(dummy[i], "Silver Medal");
            else if(i == n - 3)
                map.put(dummy[i], "Bronze Medal");
            else
                map.put(dummy[i], (n - i) + "");
        }

        String[] result = new String[n];
        for(int i = 0; i < n; i++)
        {
            result[i] = map.get(score[i]);
        }
        return result;
    }
}