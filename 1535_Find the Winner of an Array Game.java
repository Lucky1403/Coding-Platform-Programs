import java.util.*;

class Solution {
    public int maxElement(int[] arr)
    {
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maximum)
                maximum = arr[i];
        }

        return maximum;
    }
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        if(k > n)
            return maxElement(arr);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            list.add(arr[i]);

        HashMap<Integer, Integer> map = new HashMap<>();
        
        while(true)
        {
            if(list.get(0) > list.get(1)){
                map.put(list.get(0), map.getOrDefault(list.get(0),0) +1);
                int element = list.remove(1);
                list.add(element);
            }
            else{
                map.put(list.get(1), map.getOrDefault(list.get(1),0) +1);
                int element = list.remove(0);
                list.add(element);
            }

            for(int key : map.keySet())
            {
                if(map.get(key) == k)
                    return key;
            }
        }
    }
}