class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        char mx = s.charAt(0);
        char mn = s.charAt(0);
        
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(ch > mx)
                mx = ch;
            if(ch < mn)
                mn = ch;
            if(i > 0 && s.charAt(i - 1) > ch)
                sorted = false;
        }

        if(sorted)
            return 0;
        if(n == 2)
            return -1;
        if(s.charAt(0) == mn || s.charAt(n-1) == mx)
            return 1;
        for(int i = 1; i < n - 1; i++)
        {
            if(s.charAt(i) == mn || s.charAt(i) == mx)
                return 2;
        }
        return 3;
    }
}