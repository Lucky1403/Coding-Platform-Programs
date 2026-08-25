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

    public int[][] kClosest(int[][] points, int k) {
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

        int[][] ans = new int[k][2];
        for(int i = 0; i < k; i++)
        {
            Triplet top = pq.remove();
            ans[i][0] = top.xCoordinate;
            ans[i][1] = top.yCoordinate;
        }
        return ans;
    }
}