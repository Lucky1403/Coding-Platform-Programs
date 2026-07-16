class Solution {
    public int subtractProductAndSum(int n) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        
        int Lastdigit = 0;

        while(n > 0)
        {
           Lastdigit = n % 10;
           n = n/10;

           sumOfDigits += Lastdigit;
           productOfDigits *= Lastdigit;
        }

        return productOfDigits - sumOfDigits;
    }
}