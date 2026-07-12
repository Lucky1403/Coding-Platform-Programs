class Solution {
    public void reverseString(char[] s) {
        int length = s.length;

        int start = 0;
        int end = length - 1;
        for(int i = 0; i < length / 2; i++)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}