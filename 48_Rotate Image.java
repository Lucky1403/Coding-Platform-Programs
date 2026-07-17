class Solution {
    public void reverseArray(int[] arr)
    {
        int i = 0;
        int j = arr.length - 1;

        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        
        int m = matrix.length; 

        for(int i = 0; i < m; i++)
        {
            for(int j = i; j < m; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < m; i++)
        {
            reverseArray(matrix[i]);
        }
    }
}