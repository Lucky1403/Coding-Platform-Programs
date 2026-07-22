class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        int n = words.length;

        int count = words[n - 1].length();

        return count;
    }
}