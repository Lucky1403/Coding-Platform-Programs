class Solution {
    public boolean checkRecord(String s) {
        int CountA = 0;
        int CountL = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A')
                CountA++;
            if(ch == 'L'){
                if(CountL >= 3)
                    return false;
                CountL++;
            }
            else{
                if(CountL >= 3)
                    return false;
                CountL = 0;
            }
        }
        
        if(CountA >= 2)
            return false;
        if(CountL >= 3)
            return false;
        
        return true;
    }
}