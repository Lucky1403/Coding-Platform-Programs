class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        int firstPointer = 0;
        int secondPointer = 0;

        for(int i = 0; i < nums1.length; i++)
        {
            if(firstPointer < m && (secondPointer >= n || nums1Copy[firstPointer] <= nums2[secondPointer]))
            {
                nums1[i] = nums1Copy[firstPointer];
                firstPointer++; 
            }
            else
            {
                nums1[i] = nums2[secondPointer];
                secondPointer++;
            }
        }
    }
}