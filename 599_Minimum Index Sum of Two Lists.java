import java.util.*;

class Pair
{
    String word;
    int index;
    Pair(String word, int index)
    {
        this.word = word;
        this.index = index;
    }
}
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.index - b.index);

        for(int i = 0; i < list1.length; i++)
        {
            map.put(list1[i], i);
            set.add(list1[i]);
        }

        for(int i = 0; i < list2.length; i++)
        {
            if(set.contains(list2[i]))
                pq.add(new Pair(list2[i], i + map.get(list2[i])));
        }

        ArrayList<String> ans = new ArrayList<>();
        if(pq.size() == 0)
            return new String[0];

        Pair p = pq.remove();
        ans.add(p.word);
        int index = p.index;
        while(pq.size() > 0)
        {
            Pair p1 = pq.remove();
            if(p1.index == index)
                ans.add(p1.word);
            else
                break;
        }

        return ans.toArray(new String[ans.size()]);
    }
}