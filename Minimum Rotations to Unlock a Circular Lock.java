class Solution {
    public int rotationCount(int r, int d) {
        int result = 0;
        String rString = r + "";
        String dString = d + "";
        for(int i = 0; i < rString.length(); i++)
        {
            int rDigit = Character.getNumericValue(rString.charAt(i));
            int dDigit = Character.getNumericValue(dString.charAt(i));
            int diff = Math.abs(rDigit - dDigit);
            result += Math.min(diff, 10 - diff);
        }
        return result;
    }
}