import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    
    class Triplet implements Comparable <Triplet>{
        int distance;
        int xCoordinate;
        int yCoordinate;

        Triplet(int distance, int xCoordinate, int yCoordinate)
        {
            this.distance = distance;
            this.xCoordinate = xCoordinate;
            this.yCoordinate = yCoordinate;
        }

        public int compareTo(Triplet t)
        {
            return (this.distance - t.distance);
        }
    }
    
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
       PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] point : points)
        {
            int x = point[0];
            int y = point[1];
            int dist = x * x + y * y;

            pq.add(new Triplet(dist, x ,y));
            if(pq.size() > k)
            {
                pq.remove();
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); 
        while (!pq.isEmpty()) { 
            Triplet top = pq.remove(); 

            ArrayList<Integer> coordinates = new ArrayList<>();
            coordinates.add(top.xCoordinate);
            coordinates.add(top.yCoordinate);

            ans.add(coordinates); 
        } 

        return ans;
    }
}