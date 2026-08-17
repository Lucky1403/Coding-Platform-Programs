import java.util.Stack;

class Solution {
    public boolean sameStyle(char a, char b){
        if(a == '[' && b == ']')
            return true;
        if(a == '(' && b == ')')
            return true;
        if(a == '{' && b == '}')
            return true;

        return false;
    }
    
    public boolean isBalanced(String s) {
         if(s.length() % 2 != 0)
        {
            return false;
        }

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top = st.peek();
                if(sameStyle(top, ch))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return (st.size()==0);
    }
}