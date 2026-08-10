import java.util.HashMap;

class Solution {
    int countPairs(int[] arr, int k) {
        
       HashMap<Integer, Integer> map = new HashMap<>();
       
       for(int i = 0; i < arr.length; i++)
       {
           int num = arr[i];
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
       
       int pairs = 0;
       for(int ele : map.keySet())
       {
           int rem1 = ele - k;
           int rem2 = ele + k; 
           
           if(map.containsKey(rem1))
           {
               pairs += (map.get(ele) * (map.get(rem1)));
           }
           if(map.containsKey(rem2))
           {
               pairs += (map.get(ele) * (map.get(rem2)));
           }
       }
       
       pairs/= 2;
       return pairs;
        
    }
}