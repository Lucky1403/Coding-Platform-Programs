import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            
            char top = st.peek();
            if(ch == top)
            {
                continue;
            }
            else
            {
                st.push(ch);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while(st.size() > 0)
        {
            result = result.append(st.pop());
        }
        
        return result.reverse().toString(); 
        
    }
}