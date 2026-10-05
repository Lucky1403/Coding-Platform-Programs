import java.util.*;

class Pair implements Comparable<Pair>
{
    int start;
    int end;

    Pair(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public int compareTo(Pair other)
    {
        if(this.end == other.end)
            return Integer.compare(this.start, other.start);
        return Integer.compare(this.end, other.end);
    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;
        ArrayList<Pair> intervalList = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            intervalList.add(new Pair(intervals[i][0], intervals[i][1]));
        }

        Collections.sort(intervalList);

        int endTime = intervalList.get(0).end;
        for(int i = 1; i < n; i++)
        {
            if(intervalList.get(i).start >= endTime)
            {
                endTime = intervalList.get(i).end;
                count++;
            }
        }

        return n - count - 1;
    }
}