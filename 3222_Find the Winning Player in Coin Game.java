import java.util.*;

class Solution {
    public String winningPlayer(int x, int y) {
        int numberOfTurns = Math.min(x, y / 4);
        
        if(numberOfTurns % 2 == 0)
        {
            return "Bob";
        }
        else
        {
            return "Alice";
        }
    }
}