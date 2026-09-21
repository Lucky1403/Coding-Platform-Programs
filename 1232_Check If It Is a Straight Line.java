class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        
        int m1 = x1 - x0;
        int m2 = y1 - y0;
        //Calculating the slope
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if (m2 * (x - x0) != m1 * (y - y0)) {
                return false;
            }
        }
        
        return true;
    }
}
