class Solution {
    public int mostWordsFound(String[] sentences) {

        int maxCount = 0;

        for (String str : sentences) {
            int count = 1;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isWhitespace(ch)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }

        }

        return maxCount;
    }
}