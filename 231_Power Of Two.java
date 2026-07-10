class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n < 1)
        {
            return false;
        }

        String binaryString = Integer.toBinaryString(n);

        System.out.println(binaryString);

        if(binaryString.charAt(0) != '1')
        {
            return false;
        }

        for(int i = 1; i < binaryString.length(); i++)
        {
            if(binaryString.charAt(i) != '0')
            {
                return false;
            }
        }
        return true;
    }
}