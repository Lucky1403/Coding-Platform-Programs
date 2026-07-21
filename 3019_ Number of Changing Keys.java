class Solution {
    public int countKeyChanges(String s) {
        String newString = s.toLowerCase();

        int keyChange = 0;
        for(int i = 1; i < newString.length(); i++)
        {
            if(newString.charAt(i - 1) == newString.charAt(i))
            {
                ;
            }
            else
            {
                keyChange++;
            }
        }

        return keyChange;
    }
}