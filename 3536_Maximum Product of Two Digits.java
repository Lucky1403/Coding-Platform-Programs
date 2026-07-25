class Solution {
    public int maxProduct(int n) {
        int[] digitArray = Integer.toString(n).chars().map(c -> c - '0').toArray();

        int maxProduct = 0;

        int currentProduct = 1;
        for(int i = 0; i < digitArray.length; i++)
        {
            for(int j = i + 1; j < digitArray.length; j++)
            {
                currentProduct = digitArray[i] * digitArray[j];
                if(currentProduct > maxProduct)
                {
                    maxProduct = currentProduct;
                }
            }
        }

        return maxProduct;
    }
}