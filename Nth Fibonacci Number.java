class Solution {
    static int nthFibonacci(int n) {

        // Iterative Code
        // if(n == 0 || n == 1)
        // {
        //     return n;
        // }
        
        // int a = 0;
        // int b = 1;
        // int temp = 0;
        // for(int i = 2; i <=n; i++)
        // {
        //     temp = a + b;
        //     a = b;
        //     b = temp;
        // }

        // return temp;

        // Recursive Code
        if(n == 0 || n == 1)
        {
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}