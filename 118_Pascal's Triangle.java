import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        int[][] ans = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        for (int[] row : ans) {
           
            List<Integer> innerList = new ArrayList<>();

            for (int num : row) {
                innerList.add(num);
            }
            
            answer.add(innerList);
        }
        return answer;
    }
}