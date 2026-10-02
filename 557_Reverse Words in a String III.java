class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        for(int i = 0; i < array.length; i++)
        {
            StringBuilder sb = new StringBuilder(array[i]);
            array[i] = sb.reverse().toString();
        }
        String result = "";
        for(int j = 0; j < array.length -1; j++)
        {
            result += array[j] + " ";
        }
        return result + array[array.length - 1];
    }
}