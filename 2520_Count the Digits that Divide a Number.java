class Solution {
    public int countDigits(int num) {
        int result = 0;
        int originalNum = num;
        int temp;
        while(num > 0)
        {
            temp = num % 10;
            if(originalNum % temp == 0)
            {
                result++;
            }
            num = num / 10;
        }

        return result;
    }
}