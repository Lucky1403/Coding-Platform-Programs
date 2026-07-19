class Solution {
    public boolean areNumbersAscending(String s) {
        int previous = -1;
        String[] tokens = s.split(" ");
        
        for (String token : tokens) {

            if (Character.isDigit(token.charAt(0))) {
                int current = Integer.parseInt(token);
                
                if (current > previous) {
                    previous = current;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
