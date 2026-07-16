class Solution {
    public int firstUniqChar(String s) {

        int frequency[] = new int[27];

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            frequency[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(frequency[ch - 'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}