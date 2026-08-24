class Solution {
    public int findUnique(int[] arr) {
        int result = 0;
        for(int num : arr)
        {
            result ^= num;
        }
        return result;
    }
}