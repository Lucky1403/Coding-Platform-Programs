class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            int difference = Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
            if (difference > 2) {
                return false;
            }
        }

        return true;
    }
}