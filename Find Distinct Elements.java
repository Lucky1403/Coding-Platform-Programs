import java.util.HashSet;

class Solution {
    static int distinct(int arr[], int n) {

        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++)
        {
            set.add(arr[i]);
        }
        
        return set.size();
    }
}