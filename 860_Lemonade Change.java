class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        int twentyCount = 0;

        for(int i = 0; i < bills.length; i++)
        {
            if(bills[i] == 5)
            {
                fiveCount++;
            }
            else if(bills[i] == 10)
            {
                tenCount++;
                if(fiveCount < 1)
                    return false;
                fiveCount--;
            }
            else if(bills[i] == 20)
            {
                twentyCount++;
                if(tenCount < 1)
                {
                    if(fiveCount < 3)
                    {
                        return false;
                    } 
                }
                else
                {
                    if(fiveCount < 1)
                    {
                        return false;
                    }
                }

                if(fiveCount >= 1 && tenCount >= 1)
                {
                    fiveCount--;
                    tenCount--;
                }
                else if(fiveCount >= 3)
                {
                    fiveCount -= 3;
                }
            }
        }
        return true;
    }
}