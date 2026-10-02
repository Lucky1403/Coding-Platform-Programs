class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;
        if(Character.isUpperCase(word.charAt(0)))
        {
            if(word.length() > 1 && Character.isUpperCase(word.charAt(1)) )
            {
                for(int i = 2; i < word.length(); i++)
                {   
                    char ch = word.charAt(i);
                    if(Character.isLowerCase(ch))
                        return false;
                }
            }
            else
            {
                for(int i = 2; i < word.length(); i++)
                {   
                    char ch = word.charAt(i);
                    if(Character.isUpperCase(ch))
                        return false;
                }
            }
        }
        else
        {
            for(int i = 1; i < word.length(); i++)
            {   
                char ch = word.charAt(i);
                if(Character.isUpperCase(ch))
                    return false;
            }
        }
        return true;
    }
}