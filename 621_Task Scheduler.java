import java.util.HashMap;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < tasks.length; i++)
            map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);

        int maximumCount = Integer.MIN_VALUE;
        for(char key : map.keySet())
        {
            if(map.get(key) > maximumCount)
                maximumCount = map.get(key);
        }

        int candidateWithMaxFreq = 0;
        for(char key : map.keySet())
        {
            if(map.get(key) == maximumCount)
                candidateWithMaxFreq++;
        }

        int possibleAnswer = (maximumCount - 1) * (n + 1) + candidateWithMaxFreq;
        return Math.max(possibleAnswer,tasks.length);
    }
}