import java.util.*;

class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> responseCount = new HashMap<>();
        for(List<String> responseList : responses)
        {
            HashSet<String> responseSet = new HashSet<>(responseList);
            for(String str : responseSet)
                responseCount.put(str, responseCount.getOrDefault(str, 0) + 1);
        }

        int maxCount = 0;
        for(String str : responseCount.keySet())
        {
            if(responseCount.get(str) > maxCount)
                maxCount = responseCount.get(str);
        }

        ArrayList<String> candidates = new ArrayList<>();
        for(String str : responseCount.keySet())
        {
            if(responseCount.get(str) == maxCount)
                candidates.add(str);
        }
        Collections.sort(candidates);
        return candidates.get(0);   
    }
}