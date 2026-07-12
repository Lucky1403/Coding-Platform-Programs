import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int size = arr.length;

        if (size == 0) {
            return arr;
        }

        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < size; i++) {

            if (i > 0 && sortedArray[i] != sortedArray[i - 1]) {
                rank++;
            }

            rankMap.put(sortedArray[i], rank);
        }

        int[] resultArray = new int[size];
        for (int j = 0; j < size; j++) {
            resultArray[j] = rankMap.get(arr[j]);
        }

        return resultArray;
    }
}
