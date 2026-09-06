import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0)
            return 0;
        if(s.length == 0)
            return 0;
        
        Arrays.sort(g);
        Arrays.sort(s);

        int leftPointer = 0;
        int rightPointer = 0;
        int answer = 0;

        while(leftPointer < s.length && rightPointer < g.length){
            if(s[leftPointer] >= g[rightPointer])
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