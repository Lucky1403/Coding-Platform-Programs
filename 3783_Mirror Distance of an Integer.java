class Solution {
    public int mirrorDistance(int n) {
        int originalNumber = n;
        StringBuilder sb = new StringBuilder();
        while(originalNumber > 0)
        {
            int digit = originalNumber % 10;
            originalNumber /= 10;
            sb.append(digit);
        }

        int reverseNumber = Integer.parseInt(sb + "");
        
        return Math.abs(n - reverseNumber);
    }
}