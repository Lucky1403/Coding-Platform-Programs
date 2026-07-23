class Solution {
    public String reverseVowels(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while(leftPointer < rightPointer)
        {
            if(sb.charAt(leftPointer) != 'a' && sb.charAt(leftPointer) != 'e' && sb.charAt(leftPointer) != 'i' && sb.charAt(leftPointer) != 'o' && sb.charAt(leftPointer) != 'u' && sb.charAt(leftPointer) != 'A' && sb.charAt(leftPointer) != 'E'&& sb.charAt(leftPointer) != 'I'&& sb.charAt(leftPointer) != 'O'&& sb.charAt(leftPointer) != 'U')
            {
                leftPointer++;
            }
            else if(sb.charAt(rightPointer) != 'a' && sb.charAt(rightPointer) != 'e' && sb.charAt(rightPointer) != 'i' && sb.charAt(rightPointer) != 'o' && sb.charAt(rightPointer) != 'u' && sb.charAt(rightPointer) != 'A' && sb.charAt(rightPointer) != 'E'&& sb.charAt(rightPointer) != 'I'&& sb.charAt(rightPointer) != 'O'&& sb.charAt(rightPointer) != 'U')
            {
                rightPointer--;
            }
            else
            {
                char temp = sb.charAt(leftPointer);
                sb.setCharAt(leftPointer, sb.charAt(rightPointer));
                sb.setCharAt(rightPointer, temp);
                leftPointer++;
                rightPointer--;
            }
        }

        return sb.toString();
    }
}