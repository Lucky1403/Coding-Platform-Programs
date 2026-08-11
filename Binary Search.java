class Solution {
    public boolean binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high)
        { 
            int mid = (low + high) / 2;
            
            if(arr[mid] == k)
            {
                return true;
            }
            else if(arr[mid] > k)
            {
                high = mid - 1;
            }
            else if(arr[mid] < k)
            {
                low = mid + 1;
            }
        }
        return false;
    }
}