class CheckBit {
    static boolean checkKthBit(int n, int k) {
       n = n >> k;
       return (n % 2 == 1);
    }
}