class Solution {
    public int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int EvenN = 0;
        int OddN = 0;

        for(int i = 1; i <= 2 * n ; i++)
        {
            if(i % 2 == 0)
            {
                EvenN += i;
            }
            else
            {
                OddN += i;
            }
        }

        int result = gcd(EvenN, OddN);
        return result;
    }
}