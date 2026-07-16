import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int size = nums.length;

        BigInteger[] NumberArray = new BigInteger[size];

        int i = 0;
        for(String s : nums)
        {
            NumberArray[i++] = new BigInteger(s);
        }

        Arrays.sort(NumberArray);

        String answer = NumberArray[size - k].toString();

        return answer;
    }
}