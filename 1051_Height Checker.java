import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] copyArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copyArray);

        int result = 0;

        for(int i = 0; i < heights.length; i++)
        {
            if(heights[i] != copyArray[i])
            {
                result++;
            }
        }

        return result;
    }
}