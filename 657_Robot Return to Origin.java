class Solution {
    public boolean judgeCircle(String moves) {
        int payoffX = 0;
        int payoffY = 0;
        for(int i = 0; i < moves.length(); i++)
        {
            if(moves.charAt(i) == 'R')
            {
                payoffX += 1;
            }
            else if(moves.charAt(i) == 'L')
            {
                payoffX -= 1;
            }
            else if(moves.charAt(i) == 'U')
            {
                payoffY += 2;
            }
            else if(moves.charAt(i) == 'D')
            {
                payoffY -= 2;
            }
        }

        if(payoffX == 0 && payoffY == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}