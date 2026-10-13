import java.util.ArrayList;

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 9){
                String word = nums[i] + "";
                for(int j = 0; j < word.length(); j++)
                {
                    char ch = word.charAt(j);
                    int value = Character.getNumericValue(ch);
                    list.add(value);
                }
            }
            else
                list.add(nums[i]);
        }

        int[] result = new int[list.size()];
        int idx = 0;
        for(int x : list)
            result[idx++] = x;

        return result;
    }
}