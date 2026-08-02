class Solution {
    public int[] scoreValidator(String[] events) {
    
        int ans[] = new int[2];
        // ans[0] = score;
        // ans[1] = counter;

        for(int i = 0; i < events.length; i++)
        {
            String str = events[i];
            if(ans[1] >= 10)
            {
                break;
            }
            
            if(str.equals("WD"))
            {
                ans[0]++;
            }
            else if(str.equals("W"))
            {
                ans[1]++;
            }
            else if(str.equals("NB"))
            {
                ans[0]++;
            }
            else
            {
                int number = Integer.parseInt(str);
                ans[0] += number; 
            }
        }

        return ans;
    }
}   