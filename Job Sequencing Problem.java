import java.util.ArrayList;
import java.util.Collections;

class Triplet implements Comparable<Triplet> {
    int position;
    int deadline;
    int profit;

    Triplet(int position, int deadline, int profit) {
        this.position = position;
        this.deadline = deadline;
        this.profit = profit;
    }

    public int compareTo(Triplet other) {
        return Integer.compare(other.profit, this.profit);
    }
}

class Solution {

    int[] parent;

    int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        ArrayList<Triplet> jobs = new ArrayList<>();

        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs.add(new Triplet(i, deadline[i], profit[i]));
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        Collections.sort(jobs);

        parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++)
            parent[i] = i;

        int jobsCompleted = 0;
        int totalProfit = 0;

        for (Triplet job : jobs) {
            int slot = find(Math.min(job.deadline, maxDeadline));

            if (slot > 0) {
                jobsCompleted++;
                totalProfit += job.profit;
                parent[slot] = find(slot - 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(jobsCompleted);
        result.add(totalProfit);

        return result;
    }
}