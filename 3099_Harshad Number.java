class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int originalNumber = x;
        while(originalNumber > 0)
        {
            sum += originalNumber % 10;
            originalNumber /= 10;
        }
        if(x % sum == 0)
            return sum;

        return -1;
    }
}