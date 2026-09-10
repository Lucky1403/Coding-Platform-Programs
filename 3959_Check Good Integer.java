class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        while (n > 0) {
            int parityDigit = n % 10;
            n = n / 10;
            digitSum += parityDigit;
            squareSum += parityDigit * parityDigit;
        }

        if (squareSum - digitSum >= 50)
            return true;
        else
            return false;
    }
}