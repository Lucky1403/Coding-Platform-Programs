import java.util.ArrayList;

class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        if(n == 1 || n == 2)
        {
            return nums;
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int mainPointer = 2;
        while(mainPointer < n)
        {
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1))
            {
                arr1.add(nums[mainPointer]);
            }
            else
            {
                arr2.add(nums[mainPointer]);
            }
            mainPointer++;
        }

        int idx = 0;
        for(int val : arr1)
        {
            nums[idx] = val;
            idx++;
        }

        for(int val : arr2)
        {
            nums[idx] = val;
            idx++;
        }
        return nums;
    }
}