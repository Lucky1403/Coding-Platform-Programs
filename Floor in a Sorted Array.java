class Solution {
    static int findFloor(int[] arr, int x) {
        int low = 0; 
        int high = arr.length - 1;
        int index = -1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            if(arr[mid] > x)
            {
                high = mid - 1;
            }
            
            else if(arr[mid] <= x)
            {
                index = mid;
                low = mid + 1;
            }
        }
        
        return index;
    }
}
