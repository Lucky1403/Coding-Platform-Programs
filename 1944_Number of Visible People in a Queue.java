import java.util.Stack;

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] ans = new int[n];
        ans[n - 1] = 0;
        st.push(heights[n-1]);

        
        for(int i = n - 2; i >= 0; i--)
        {
            int count = 0;
            while(!st.isEmpty() && heights[i] > st.peek())
            {
                st.pop();
                count++;
            }

            if(st.size() == 0)
            {
                ans[i] = count;
            }
        
            if(st.size() > 0 && heights[i] < st.peek())
            {
                count = count + 1;
                ans[i] = count;
            }

            st.push(heights[i]);
        }
        return ans;
    }
}