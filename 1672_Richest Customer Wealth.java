class Solution {
    public int MaxElement(int[] array)
    {
        int maxElement = 0;;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > maxElement)
            {
                maxElement = array[i];
            }
        }

        return maxElement;
    }
    public int maximumWealth(int[][] accounts) {

        int newArray[] = new int[accounts.length];

        for(int i = 0; i < accounts.length; i++)
        {
            for(int j = 0; j < accounts[0].length; j++)
            {
                newArray[i] += accounts[i][j];
            }
        }

        return MaxElement(newArray);
    }
}