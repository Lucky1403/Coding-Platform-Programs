class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        int result = 0;
        for(int ele : arr)
        {
            result ^= ele;
        }
        return result;
    }
}