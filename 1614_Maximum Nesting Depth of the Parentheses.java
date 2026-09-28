class Solution {
    public int maxDepth(String s) {
        int openBraces = 0;
        int closedBraces = 0;
        int answer = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                openBraces++;
            if(ch == ')')
                closedBraces++;
            
            answer = Math.max((openBraces - closedBraces), answer);
        }
        return answer;
    }
}