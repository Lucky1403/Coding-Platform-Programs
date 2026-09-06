import java.util.Arrays;

class Solution {
    static int solve(int bt[]) {
       Arrays.sort(bt);
       int timer = 0;
       int waitingTime = 0;
       for(int i = 0; i < bt.length; i++)
       {
           waitingTime += timer;
           timer += bt[i];
       }
       return waitingTime / bt.length;
    }
}
