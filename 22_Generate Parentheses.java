import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        generate(n, 0, 0, "", answer);
        return answer;
    }

    private void generate(int n, int left, int right, String s, List<String> answer) {
        if(right == n)
        {
            answer.add(s);
            return;
        }
        
        if(left < n){
            generate(n, left + 1, right, s + "(", answer);
        }
        if(right < left){
            generate(n, left, right + 1, s + ")", answer);
        }
    }
}