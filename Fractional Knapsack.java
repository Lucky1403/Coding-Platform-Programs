import java.util.*;

class Triplet implements Comparable<Triplet>
{
    int weight;
    int value;
    Double pvRatio;

    Triplet(int weight, int value)
    {
        this.weight = weight;
        this.value = value;
        this.pvRatio = (double) value / (double) weight;
    }

    public int compareTo(Triplet other)
    {
        return Double.compare(other.pvRatio, this.pvRatio);
    }
}

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        ArrayList<Triplet> items = new ArrayList<>();
        for(int i = 0; i < val.length; i++)
            items.add(new Triplet(wt[i], val[i]));

        Collections.sort(items);
        double totalValue = 0;
        for(Triplet item : items)
        {
            if(capacity >= item.weight)
            {
                totalValue += item.value;
                capacity -= item.weight;
            }
            else
            {
                totalValue += (double)item.value * ((double)capacity / (double)item.weight);
                break;
            }
        }
        return totalValue;
    }
}