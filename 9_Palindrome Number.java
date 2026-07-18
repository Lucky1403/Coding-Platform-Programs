class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        System.out.print(s);

        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}