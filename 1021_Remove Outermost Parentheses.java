class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                if(count > 1)
                    result.append(ch);
            }
            else{
                if(count > 1)
                    result.append(ch);
                count--; 
            }
        }
        return result.toString();
    }
}