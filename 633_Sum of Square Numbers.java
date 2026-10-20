class Solution {
    public boolean judgeSquareSum(int c) {
        long lowPointer = 0;
        long highPointer = (int)Math.sqrt(c);

        while(lowPointer <= highPointer)
        {   
            if(lowPointer * lowPointer + highPointer * highPointer == c)
                return true;
            else if(lowPointer * lowPointer + highPointer * highPointer < c)
                lowPointer++;
            else
                highPointer--;
        }
        return false;
    }
}