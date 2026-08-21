class Solution {
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);

        int count = 0;
        for(int i = 0; i < binaryString.length(); i++)
        {
            char ch = binaryString.charAt(i);
            if(ch == '1')
            {
                count++;
            }
        }
        return count;
    }
}