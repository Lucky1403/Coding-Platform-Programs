class Solution {
    public int[][] generateMatrix(int n) {
        int leftColumn = 0; 
        int rightColumn = n - 1;
        int topRow = 0;
        int bottomRow = n - 1;

        int[][] matrix = new int[n][n];
        int currentElement = 1;
        while(currentElement <= n * n)
        {
            for(int j = leftColumn; j<= rightColumn && currentElement <= n*n; j++)
            {
                matrix[topRow][j] = currentElement++;
            }
            topRow++;

            for(int i = topRow; i <= bottomRow && currentElement <= n * n; i++)
            {
                matrix[i][rightColumn] = currentElement++;
            }
            rightColumn--;

            for(int j = rightColumn; j >= leftColumn && currentElement <= n * n; j--)
            {
                matrix[bottomRow][j] = currentElement++;
            }
            bottomRow--;

            for(int i = bottomRow; i >= topRow && currentElement <= n * n; i--)
            {
                matrix[i][leftColumn] = currentElement++;
            }
            leftColumn++;
        }
        return matrix;
    }
}