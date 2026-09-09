class Solution {
    public long countCommas(long n) {
        long answer = 0;
        for (long x = 1000; x <= n; x *= 1000) {
            answer += (n - x + 1);
        }
        return answer;
    }
}