class Solution {
    public String reverseOnlyLetters(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);

        while(leftPointer < rightPointer)
        {
            char chL = s.charAt(leftPointer);
            char chR = s.charAt(rightPointer);

            if(Character.isLetter(chL) && Character.isLetter(chR))
            {
                char temp = sb.charAt(leftPointer);
                sb.setCharAt(leftPointer, sb.charAt(rightPointer));
                sb.setCharAt(rightPointer, temp);
                leftPointer++;
                rightPointer--;
            }
            else if(Character.isLetter(chL) && !Character.isLetter(chR))
            {
                rightPointer--;
            }
            else
            {
                leftPointer++;
            }
        }

        return sb.toString();
    }
}