class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int nextTerm = 0;

        if(n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            for (int i = 2; i <= n; ++i) 
            {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            }
        }
        return b;
    }
}