import java.util.*;

class Triplet implements Comparable<Triplet> 
{
    int position;
    int enqueueTime;
    int processingTime;

    Triplet(int position, int enqueueTime, int processingTime)
    {
        this.position = position;
        this.enqueueTime = enqueueTime;
        this.processingTime = processingTime;
    }

    public int compareTo(Triplet other)
    {
        if(this.enqueueTime == other.enqueueTime)
            return Integer.compare(this.processingTime, other.processingTime);
        return Integer.compare(this.enqueueTime, other.enqueueTime);
    }
}

class Pair implements Comparable<Pair>
{
    int position;
    int processingTime;
    Pair(int position, int processingTime)
    {
        this.position = position;
        this.processingTime = processingTime;
    }

    public int compareTo(Pair other)
    {
        if(this.processingTime == other.processingTime)
            return Integer.compare(this.position, other.position);
        return Integer.compare(this.processingTime, other.processingTime);
    }

}

class Solution {
    public int[] getOrder(int[][] tasks) {
        ArrayList<Triplet> taskList = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < tasks.length; i++)
            taskList.add(new Triplet(i, tasks[i][0], tasks[i][1]));

        Collections.sort(taskList);

        int[] answer = new int[tasks.length];
        int currentTime = taskList.get(0).enqueueTime;
    
        int index = 0;

        for(int i = 0; i < tasks.length; i++)
        {
            while(index < taskList.size() && taskList.get(index).enqueueTime <= currentTime)
            {
                Triplet task = taskList.get(index);
                pq.add(new Pair(task.position, task.processingTime));
                index++;
            }

            if(!pq.isEmpty())
            {
                Pair task = pq.poll();
                answer[i] = task.position;
                currentTime += task.processingTime;
            }
            else
                currentTime = taskList.get(index).enqueueTime;
                i--;
        }
        return answer;
    }
}