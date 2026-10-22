class Solution {
    public long sumAndMultiply(int n) {
        String number = n + "";
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 0; i < number.length(); i++)
        {
            char ch = number.charAt(i);
            int digit = ch - '0';
            if(digit > 0){
                sb.append(digit);
                sum += digit;
            }
        }

        String input = sb.toString();
        long calculatedNumber = 0L;
        if (input.isEmpty()) {
            calculatedNumber = 0L; 
        } else {
            calculatedNumber = Long.parseLong(input);
        }
        return calculatedNumber * sum;
    }
}