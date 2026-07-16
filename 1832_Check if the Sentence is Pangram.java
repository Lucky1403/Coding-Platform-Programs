class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
        {
            return false;
        }

        int frequency[] = new int[26];

        for(int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            frequency[ch - 'a']++;
        }

        for(int i = 0; i < frequency.length; i++)
        {
            if(frequency[i] == 0)
            {
                return false;
            }
        }
        return true;
    }
}