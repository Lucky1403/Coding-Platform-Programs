class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int openCount = 0;
        int i = 0;
        int n = s.length();
        
        while(i < n)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                openCount++;
                i++;
            }
            else
            {
                if(i + 1 < n && s.charAt(i + 1) == ')')
                    i += 2;
                else
                {
                    insertions++;
                    i++;
                }

                if(openCount > 0)
                    openCount--;
                else
                    insertions++;
            }
        }
        return insertions + (openCount * 2);
    }
}