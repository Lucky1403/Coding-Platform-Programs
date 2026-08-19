class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        int i = 0;
        int n = s.length();
        while(i < n && s.charAt(i) == ' ')
        {
            i++;
        }

        if(i == n)
        {
            return 0;
        }

        int sign = 1;
        Character firstChar = s.charAt(i);
        if(firstChar == '-')
        {
            sign = -1;
            i++;
        }
        else if(firstChar == '+')
        {
            i++;
        }

        while(i < n)
        {
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9')
            {
                break;
            }
            ans = ans * 10 + (ch - '0');

            if(sign == 1 && ans > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -ans < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }

            i++;
        }
        return (int) ans * sign;
    }
}