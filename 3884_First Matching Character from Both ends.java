class Solution {
    public int firstMatchingIndex(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer <= rightPointer)
        {
            if(s.charAt(leftPointer) == s.charAt(rightPointer))
            {
                return leftPointer;
            }

            leftPointer++;
            rightPointer--;
        }

        return -1;
    }
}