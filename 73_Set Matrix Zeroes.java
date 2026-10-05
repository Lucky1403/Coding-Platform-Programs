import java.util.ArrayList;

class Pair
{
    int x;
    int y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Pair> zeroPositions = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                    zeroPositions.add(new Pair(i, j));
            }
        }

        for(Pair p : zeroPositions)
        {
            int m = p.x;
            int n = p.y;
            for(int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[0].length; j++)
                {
                    if(i == m || j == n)
                    {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}