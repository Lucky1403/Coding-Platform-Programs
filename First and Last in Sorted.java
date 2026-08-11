import java.util.ArrayList;

class Solution {
	ArrayList<Integer> find(int arr[], int x) {
		int low = 0;
		int high = arr.length - 1;
		
		int[] arr2 = new int[2];
		arr2[0] = -1;
		arr2[1] = -1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] == x)
			{
				arr2[0] = mid;
				high = mid - 1;
			}
			else if (arr[mid] > x)
			{
				high = mid - 1;
			}
			else if (arr[mid] < x)
			{
				low = mid + 1;
			}
		}
		
		low = 0;
		high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] == x)
			{
				arr2[1] = mid;
				low = mid + 1;
			}
			else if (arr[mid] > x)
			{
				high = mid - 1;
			}
			else if (arr[mid] < x)
			{
				low = mid + 1;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>(arr2.length);
        for (int i : arr2) {
            list.add(i); // Automatically boxes int to Integer
        }
        
		return list;
	}
}
