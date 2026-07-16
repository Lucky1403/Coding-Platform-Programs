class Solution {
    public int signFunc(int sign)
    {
        if(sign > 0)
        {
            return 1;
        }
        else if(sign < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    public int arraySign(int[] nums) {
        int sign = 1;
        for(int i : nums)
        {
            if(i == 0)
            {
                sign = 0;
                return sign;
            }

            if(i < 0)
            {
                sign = sign * -1;
            }
        }

        return signFunc(sign);
    }
}