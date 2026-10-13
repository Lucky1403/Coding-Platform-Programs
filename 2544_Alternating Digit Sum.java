class Solution {
    public int alternateDigitSum(int n) {
        int result = 0;
        int current = 1;
        String number = n + "";
        for(int i = 0; i < number.length(); i++)
        {
            char ch = number.charAt(i);
            int digit = Character.getNumericValue(ch);
            result +=  digit * current;
            current *= -1;
        }
        return result;
    }
}