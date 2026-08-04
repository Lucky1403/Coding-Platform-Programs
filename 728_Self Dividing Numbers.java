import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isDivisible(int number)
    {
        String numberString = number + "";
        char[] digits = numberString.toCharArray();
        for(int i = 0; i < digits.length; i++)
        {
            int temp = Character.getNumericValue(digits[i]);
            
            if(temp == 0)
            {
                return false;
            }

            if(number % temp != 0)
            {
                return false;
            }
        }
        
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = left; i <= right; i++)
        {
            if(isDivisible(i))
            {
                answer.add(i);
            }
        }

        return answer;
    }
}