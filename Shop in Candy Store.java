import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);

        ArrayList<Integer> result = new ArrayList<>();
        int minCost = 0;
        int leftPointer = 0;
        int rightPointer = prices.length - 1;
        while(leftPointer <= rightPointer)
        {
            if(k > 0){
                minCost += prices[leftPointer];
                leftPointer++;
                rightPointer -= k;
            }
        }
        result.add(minCost);

        int maxCost = 0;
        leftPointer = 0;
        rightPointer = prices.length - 1;
        while(leftPointer <= rightPointer)
        {
            if(k > 0)
            {
                maxCost += prices[rightPointer];
                rightPointer--;
                leftPointer += k;
            }
        }

        result.add(maxCost);
        return result;
    }
}