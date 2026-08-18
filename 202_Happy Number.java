import java.util.HashSet;

class Solution {
    public int SquareOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder * remainder;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();

        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = SquareOfDigits(n);
        }

        return n == 1;
    }
}