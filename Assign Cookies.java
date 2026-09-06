import java.util.Arrays;

class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int leftPointer = 0;
        int rightPointer = 0;
        int answer = 0;
        while(leftPointer < cookie.length && rightPointer < greed.length)
        {
            if(cookie[leftPointer] >= greed[rightPointer])
            {
                leftPointer++;
                rightPointer++;            
                answer++;
            }
            else
            {
                leftPointer++;
            }
        }
        return answer;
    }
}