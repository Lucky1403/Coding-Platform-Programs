class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MIN_VALUE - 1;
        }

        if(dividend == Integer.MIN_VALUE && divisor == 1)
        {
            return Integer.MIN_VALUE;
        }

        int answer = 0;
        long Dividend = Math.abs((long)dividend);
        long Divisor = Math.abs((long)divisor);

        while(Dividend >= Divisor)
        {
            Dividend = Dividend - Divisor;
            answer += 1;
        }

        if(dividend > 0 && divisor > 0)
        {
            ;
        }
        else if(dividend < 0 && divisor < 0)
        {
            ;
        }
        else
        {
            answer = -1 * answer;
        }

        return answer;
    }
}