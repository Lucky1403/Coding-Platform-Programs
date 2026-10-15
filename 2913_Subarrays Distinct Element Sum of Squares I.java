import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allSubLists = new ArrayList<>();
        for(int x : nums)
            list.add(x);
        
        int n = list.size();
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j <= n; j++)
                allSubLists.add(new ArrayList<>(list.subList(i, j)));
        }

        int result = 0;

        HashSet<Integer> set = new HashSet<>();
        for(List<Integer> x : allSubLists)
        {
            for(int i = 0; i < x.size(); i++)
                set.add(x.get(i));

            int currentSize = set.size();
            result += currentSize * currentSize;
            set.clear();
        }
        return result;
    }
}