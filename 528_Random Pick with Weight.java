class Solution {
    static int total;
    static int length;
    private int[] prefixArray;

    public Solution(int[] w) {
        this.prefixArray = new int[w.length];
        total = 0;
        for(int i = 0; i < w.length; i++)
        {
            total += w[i];
            this.prefixArray[i] = total;
        }
        length = w.length;
    }
    
    public int pickIndex() {
        int target = (int)(Math.random() * total) + 1;

        int low = 0;
        int high = prefixArray.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (prefixArray[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */