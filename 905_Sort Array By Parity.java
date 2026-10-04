class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
                list.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 != 0)
                list.add(nums[i]);
        }

        int idx = 0;
        for(int num : list)
        {
            nums[idx++] = num;
        }

        return nums;
    }
}