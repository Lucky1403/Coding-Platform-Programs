import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    class Triplet implements Comparable<Triplet> {
        int sum;
        int num1;
        int num2;

        Triplet(int sum, int num1, int num2) {
            this.sum = sum;
            this.num1 = num1;
            this.num2 = num2;
        }

        public int compareTo(Triplet t) {
            return Integer.compare(this.sum, t.sum);
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int firstElement = nums1[i];
                int secondElement = nums2[j];
                if (pq.size() == k && (firstElement + secondElement) >= pq.peek().sum) {
                    break;
                }

                pq.add(new Triplet((firstElement + secondElement), firstElement, secondElement));

                if (pq.size() > k) {
                    pq.remove();
                }
            }
        }

        int[][] matrix = new int[k][2];
        int i = 0;
        while (pq.size() > 0) {
            Triplet t = pq.remove();
            matrix[i][0] = t.num1;
            matrix[i][1] = t.num2;
            i++;
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int[] array : matrix) {
            List<Integer> row = new ArrayList<>();
            for (int num : array) {
                row.add(num);
            }
            ans.add(row);
        }
        Collections.reverse(ans);
        return ans;
    }
}