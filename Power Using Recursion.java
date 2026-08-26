class Solution {
    public int recursivePower(int n, int p) {
        if(p == 0)
        {
            return 1;
        }
        int call = recursivePower(n,p/2);
        if(p % 2 == 0)
        {
            return call * call;
        }
        else
        {
            return n*call*call;
        }
    }
}
