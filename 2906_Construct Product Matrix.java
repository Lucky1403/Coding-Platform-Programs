class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;
        int row = grid.length;
        int column = grid[0].length;

        long prefix = 1;
        int product[][] = new int[row][column];

        int[] prefixFlat = new int[row * column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int idx = i * column + j;
                prefixFlat[idx] = (int) prefix;
                prefix = (prefix * grid[i][j]) % MOD;
            }
        }

        long suffix = 1;
        for (int i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                int idx = i * column + j;
                product[i][j] = (int) ((prefixFlat[idx] * suffix) % MOD);
                suffix = (suffix * grid[i][j]) % MOD;
            }
        }

        return product;
    }
}