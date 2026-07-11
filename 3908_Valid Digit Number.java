class Solution {
    public boolean validDigit(int n, int x) {
        String myString = n + "";
        
        if(myString.startsWith(String.valueOf(x)))
        {
            return false;
        }

        if(myString.contains(String.valueOf(x)))
        {
            return true;
        }
        
        return false;
    }
}