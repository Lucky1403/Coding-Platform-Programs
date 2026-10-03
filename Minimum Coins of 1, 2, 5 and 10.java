class Solution {
    public int findMin(int n) {
        int[] currency = {10, 5, 2, 1};
        int count = 0;
        int idx = 0;
        while(n > 0)
        {
            if(n >= currency[idx] )
            {
                count += n/currency[idx];
                n %= currency[idx];
            }
            idx++;
        }
        
        return count;
    }
}
