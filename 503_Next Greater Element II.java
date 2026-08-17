import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i = n - 1; i >= 0; i--)
        {
            st.push(nums[i]);
        }

        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; i--)
        {
            while(st.size() > 0 && nums[i] >= st.peek())
            {
                st.pop();
            }
            
            if(st.isEmpty())
            {
                ans[i] = -1;
                st.push(nums[i]);
            }
            else
            {
                ans[i] = st.peek();
                st.push(nums[i]);
            }
        }
        return ans;
    }
}