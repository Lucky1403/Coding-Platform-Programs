class Solution {
    public int countSquares(int[][] matrix) {
        int answer = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] > 0)
                    matrix[i][j] += Math.min(matrix[i - 1][j], Math.min(matrix[i][j - 1], matrix[i - 1][j - 1]));
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer += matrix[i][j];
            }
        }
        return answer;
    }
}