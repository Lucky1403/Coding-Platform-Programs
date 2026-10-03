import java.util.Arrays;

class Solution {
    public int assignHole(int[] mices, int[] holes) {
        Arrays.sort(mices);
        Arrays.sort(holes);
        
        int time = 0;
        for(int i = 0; i < mices.length; i++)
        {
            int CurrentTime = Math.abs(holes[i] - mices[i]);
            time = Math.max(time, CurrentTime);
        }
        
        return time;
    }
}