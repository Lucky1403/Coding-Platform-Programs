class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int numberOfRows = matrix.length;
        int numberOfColumns = matrix[0].length;

        int TopRow = 0;
        int bottomRow = numberOfRows - 1;
        int leftColumn = 0;
        int rightColumn = numberOfColumns - 1;

        int totalElements = 0;

        List<Integer> result = new ArrayList<>();

        while(totalElements < numberOfRows * numberOfColumns)
        {
            for(int j = leftColumn; j <= rightColumn && totalElements < numberOfRows * numberOfColumns; j++)
            {
                result.add(matrix[TopRow][j]);
                totalElements++;
            }
            TopRow++;

            for(int i = TopRow ; i <= bottomRow && totalElements < numberOfRows * numberOfColumns; i++)
            {
                result.add(matrix[i][rightColumn]);
                totalElements++;
            }
            rightColumn--;

            for(int j = rightColumn; j >= leftColumn && totalElements < numberOfRows * numberOfColumns; j--)
            {
                result.add(matrix[bottomRow][j]);
                totalElements++;
            }
            bottomRow--;

            for(int i = bottomRow; i >= TopRow && totalElements < numberOfRows * numberOfColumns; i--)
            {
                result.add(matrix[i][leftColumn]);
                totalElements++;
            }
            leftColumn++;
        }
        return result;
    }
}