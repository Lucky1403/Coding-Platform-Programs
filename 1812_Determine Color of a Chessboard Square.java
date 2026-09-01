class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum = 0;
        if(coordinates.charAt(0) == 'a')
        {
            sum += 1;
        }
        else if(coordinates.charAt(0) == 'b')
        {
            sum += 2;
        }
        else if(coordinates.charAt(0) == 'c')
        {
            sum += 3;
        }
        else if(coordinates.charAt(0) == 'd')
        {
            sum += 4;
        }
        else if(coordinates.charAt(0) == 'e')
        {
            sum += 5;
        }
        else if(coordinates.charAt(0) == 'f')
        {
            sum += 6;
        }
        else if(coordinates.charAt(0) == 'g')
        {
            sum += 7;
        }
        else if(coordinates.charAt(0) == 'h')
        {
            sum += 8;
        }

        int secondDigit = Integer.parseInt(coordinates.charAt(1) + "");
        sum += secondDigit;

        if(sum % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}