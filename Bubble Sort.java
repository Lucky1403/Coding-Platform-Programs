class Solution {
    public void bubbleSort(int[] arr) {
       for(int i = 0; i < arr.length ; i++)
       {
           boolean isSorted = true;
           for(int j = 0; j < arr.length - 1; j++)
           {
               if(arr[j + 1] < arr[j])
               {
                   isSorted = false;
                   break;
               }
           }
           
           if(isSorted == true)
           {
               break;
           }
           
           for(int j = 0; j < arr.length - 1; j++)
           {
               if(arr[j] > arr[j + 1])
               {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
               }
               
           }
       }
        
    }
}