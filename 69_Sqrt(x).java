class Solution {
    public int mySqrt(int n) {
        long low = 1;
        long high = n;
        
        long root = 0;
        
        if(n == 1 || n == 0)
        {
            return n;
        }
        
        while(low <= high)
        {
            long mid = (low + high) / 2;
            
            if(mid * mid == n)
            {
                return (int)mid;
            }
            else if(mid * mid > n)
            {
                high = mid - 1;
            }
            else if(mid * mid < n)
            {
                root = mid;
                low = mid + 1;
            }
        }
        
        return (int)root;
    }
}