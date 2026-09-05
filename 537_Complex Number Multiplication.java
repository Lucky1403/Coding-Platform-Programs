class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int x1, x2, y1, y2;
        String[] characters1 = num1.split("\\+");
        x1 = Integer.parseInt(characters1[0]);
        String[] characters2 = num2.split("\\+");
        x2 = Integer.parseInt(characters2[0]);

        y1 = Integer.parseInt(characters1[1].replace("i", ""));
        y2 = Integer.parseInt(characters2[1].replace("i", ""));

        int realPart = (x1 * x2) - (y1 * y2);
        int imagPart = (x2 * y1) + (x1 * y2);

        return realPart + "+" + imagPart + "i";
    }
}