import java.util.Arrays;

class Pair implements Comparable<Pair>{
    int digitSum;
    int value;
    int originalIndex;

    Pair(int digitSum, int value, int originalIndex)
    {
        this.digitSum = digitSum;
        this.value = value;
        this.originalIndex = originalIndex;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.digitSum != p.digitSum) {
            return Integer.compare(this.digitSum, p.digitSum);
        }
        return Integer.compare(this.value, p.value);
    }
}

class Solution {
    public int minSwaps(int[] nums) {
        Pair[] array = new Pair[nums.length];
        for(int i = 0; i < nums.length; i++)
            array[i] = (new Pair(DigitSum(nums[i]), nums[i], i));
        
        Arrays.sort(array);

        boolean[] visited = new boolean[array.length];
        int swaps = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(visited[i] || array[i].originalIndex == i)
                continue;

            int cycleSize = 0;
            int j = i;
            while(!visited[j])
            {
                visited[j] = true;
                j = array[j].originalIndex;
                cycleSize++;
            }

            if(cycleSize > 0)
                swaps += (cycleSize - 1);
        }
        return swaps;
    }

    private int DigitSum(int num) {
        int result = 0;
        while(num > 0)
        {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}