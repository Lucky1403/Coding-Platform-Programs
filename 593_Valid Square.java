import java.util.HashSet;
import java.util.List;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<List<Integer>> points = new HashSet<>();
        points.add(List.of(p1[0], p1[1])); 
        points.add(List.of(p2[0], p2[1])); 
        points.add(List.of(p3[0], p3[1])); 
        points.add(List.of(p4[0], p4[1])); 

        if(points.size() < 4)
            return false; 
        
        HashSet<Double> set = new HashSet<>();
        double d1 = Math.sqrt((p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) *  (p2[1] - p1[1]));
        double d2 = Math.sqrt((p3[0] - p1[0]) * (p3[0] - p1[0]) + (p3[1] - p1[1]) *  (p3[1] - p1[1]));
        double d3 = Math.sqrt((p4[0] - p1[0]) * (p4[0] - p1[0]) + (p4[1] - p1[1]) *  (p4[1] - p1[1]));
        double d4 = Math.sqrt((p2[0] - p3[0]) * (p2[0] - p3[0]) + (p2[1] - p3[1]) *  (p2[1] - p3[1]));
        double d5 = Math.sqrt((p2[0] - p4[0]) * (p2[0] - p4[0]) + (p2[1] - p4[1]) *  (p2[1] - p4[1]));
        double d6 = Math.sqrt((p3[0] - p4[0]) * (p3[0] - p4[0]) + (p3[1] - p4[1]) *  (p3[1] - p4[1]));
        set.add(d1);
        set.add(d2);
        set.add(d3);
        set.add(d4);
        set.add(d5);
        set.add(d6);
        
        if(set.size() == 2)
            return true;
        else
            return false;
    }
}