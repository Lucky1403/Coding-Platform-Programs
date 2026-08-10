import java.util.HashMap;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < a.length; i++)
        {
            int num = a[i];
            if(map.containsKey(num))
            {
                int freq = map.get(num);
                map.put(num, freq + 1);
            }
            else
            {
                map.put(num, 1);
            }
        }
        
        for(int i = 0; i < b.length; i++)
        {
            int num = b[i];
            if(map.containsKey(num))
            {
                int freq = map.get(num);
                map.put(num, freq - 1);
            }
            else
            {
                return false;
            }
        }
        
        for(int key : map.keySet()){
            if(map.get(key) < 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
