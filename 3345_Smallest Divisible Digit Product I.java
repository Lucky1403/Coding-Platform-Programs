class Solution {
    public int productOfDigits(int m)
    {   
        String digit = m + "";
        char[] digits = digit.toCharArray();
        int product = 1;
        for(int i = 0; i < digits.length; i++)
        {
            int num = Character.getNumericValue(digits[i]);
            product = product * num;
        }

        return product;
    }

    public int smallestNumber(int n, int t) {
        for(int i = n; ;i++)
        {
            if(productOfDigits(i) % t == 0)
            {
                return i;
            }
        }
    }
}