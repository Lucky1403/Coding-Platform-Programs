class Solution {
    void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            
            for(int j = i; j < arr.length; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    minIdx = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        
    }
}