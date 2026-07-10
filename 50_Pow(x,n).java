class Solution {
    public double myPow(double x, int n) {
        
        if(x == 0)
        {
            return 0;
        }

        if(n == 0)
        {
            return 1;
        }

        double result = Math.pow(x, n);
        return result;
    }
}