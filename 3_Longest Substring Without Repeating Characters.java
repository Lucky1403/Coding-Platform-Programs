import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s== null || s.length() == 0)
        {
            return 0;
        }

        int leftPointer = 0;
    
        int maxCount = 0;

        HashSet<Character> set = new HashSet<>();
        for(int rightPointer = 0; rightPointer < s.length() ; rightPointer++)
        {
            char current = s.charAt(rightPointer);
            while(set.contains(current))
            {
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }

            set.add(current);

            maxCount = Math.max(maxCount, rightPointer - leftPointer + 1);
        }

        return maxCount;
    }
}