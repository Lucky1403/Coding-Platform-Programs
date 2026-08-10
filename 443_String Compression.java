class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }

        if (chars.length == 1) {
            return 1;
        }

        int leftPointer = 0;
        int rightPointer = 0;
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (rightPointer < chars.length) {
            if (chars[leftPointer] == chars[rightPointer]) {
                rightPointer++;
                count++;
            } else {
                sb.append(chars[leftPointer]);
                if (count > 1) {
                    sb.append(count);
                }
                leftPointer = rightPointer;
                count = 0;
            }
        }

        sb.append(chars[leftPointer]);
        if (count > 1) {
            sb.append(count);
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}