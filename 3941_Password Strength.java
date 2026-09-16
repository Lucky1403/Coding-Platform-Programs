import java.util.HashSet;

class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            set.add(ch);
        }

        int result = 0;
        for (char ch : set) {
            if (ch >= 'a' && ch <= 'z') 
                result++;
            else if (ch >= 'A' && ch <= 'Z') 
                result += 2;
            else if(ch >= '0' && ch <= '9')
                result += 3;
            else
                result += 5;
        }
        return result;
    }
}