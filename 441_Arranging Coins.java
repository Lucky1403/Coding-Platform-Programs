class Solution {
    public int SquareRoot(long x)
    {
        if(x == 0 || x == 1)
        {
            return (int)x;
        }

        long low = 1;
        long high = x;

        while(low <= high)
        {
            long mid = low + ((high - low)/2);
            if(mid == x/mid)
            {
                return (int)mid;
            }
            else if(mid >x/mid)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return (int)high;
    }

    public int arrangeCoins(int n) {
        long m = (long)n;
        return (SquareRoot(8 * m + 1) - 1) / 2;
    }
}