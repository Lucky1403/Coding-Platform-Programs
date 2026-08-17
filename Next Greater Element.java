import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] array = new int[n];
        
        array[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        
        for(int i = n-2; i >= 0; i--)
        {
            
            while(st.size() > 0 && arr[i] >= st.peek())
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                array[i] = -1;
            }
            else
            {
                array[i] = st.peek();
            }
            st.push(arr[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>(n);
        for(int i = 0; i < n; i++)
        {
            ans.add(array[i]);
        }
        
        return ans;
    }
}