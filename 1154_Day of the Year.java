class Solution {
    public int dayOfYear(String date) {
        int year = 0;
        for(int i = 0; i < 4; i++)
        {
            char ch = date.charAt(i);
            int digit = ch - '0';
            year = year * 10 + digit;
        }
        
        int x = 0;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            x = 29;
        } else {
            x = 28;
        }

        int[] nums = {31,x,31,30,31,30,31,31,30,31,30,31};

        int day = 0;
        for(int i = 8; i < 10; i++)
        {
            char ch = date.charAt(i);
            int digit = ch - '0';
            day = day * 10 + digit;
        }

        int month = 0;
        for(int i = 5; i < 7; i++)
        {
            char ch = date.charAt(i);
            int digit = ch - '0';
            month = month * 10 + digit;
        }

        int monthDays = 0;
        for(int i = 0; i < month - 1; i++)
        {
            monthDays += nums[i];
        }

        return (monthDays + day);
    }
}