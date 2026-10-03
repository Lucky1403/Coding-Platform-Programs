import java.util.ArrayList;
import java.util.Collections;

class Pair implements Comparable<Pair>
{
    int start;
    int end;
    int position;
    Pair(int start, int end, int position)
    {
        this.start = start;
        this.end = end;
        this.position = position;
    }

    public int compareTo(Pair p)
    {
        return this.end - p.end;
    }
}
class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        ArrayList<Pair> meetings = new ArrayList<>();
        for(int i = 0; i < s.length; i++)
        {
            meetings.add(new Pair(s[i], f[i], i + 1));
        }
        Collections.sort(meetings);

        ArrayList<Integer> result = new ArrayList<>();
        
        Pair lastSelected = meetings.get(0);
        result.add(lastSelected.position); 

        for(int i = 1; i < meetings.size(); i++)
        {
            if(meetings.get(i).start > lastSelected.end)
            {
                result.add(meetings.get(i).position);
                lastSelected = meetings.get(i); 
            }
        }
        
        Collections.sort(result);

        return result;
    }
}