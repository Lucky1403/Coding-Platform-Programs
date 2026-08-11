import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int firstPointer = 0;
        int secondPointer = 0;
        
        int n1 = a.length;
        int n2 = b.length;
        
        while(firstPointer < n1 && secondPointer < n2)
        {
            if(a[firstPointer] == b[secondPointer])
            {
                list.add(a[firstPointer]);
                firstPointer++;
                secondPointer++;
            }
            else if(a[firstPointer] < b[secondPointer])
            {
                firstPointer++;
            }
            else
            {
                secondPointer++;
            }
        }
        
        return list;
        
    }
}