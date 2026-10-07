import java.util.ArrayList;
import java.util.PriorityQueue;

class Node implements Comparable<Node>{
    Node left;
    Node right;
    int frequency;
    char character;
    int id;

    Node(int frequency, char character, int id)
    {
        this.frequency = frequency;
        this.character = character;
        this.id = id;
    }

    public int compareTo(Node n)
    {
        if (this.frequency != n.frequency)
            return Integer.compare(this.frequency, n.frequency);
        return Integer.compare(this.id, n.id);
    }
}
class Solution {
    public ArrayList<String> huffmanCodes(String s, int f[]) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int n = f.length;

        int globalID = 0;
        for(int i = 0; i < n; i++)
            pq.add(new Node(f[i], s.charAt(i), globalID++));

        while(pq.size() > 1)
        {
            Node first = pq.remove();
            Node second = pq.remove();

            Node root = new Node(first.frequency + second.frequency, '$', Math.min(first.id, second.id));
            root.left = first;
            root.right = second;
            pq.add(root);
        }

        Node root = pq.remove();
        ArrayList<String> list = new ArrayList<>();
        if (n == 1)
            list.add("0");
        else
            preOrder(root, "", list);

        return list;
    }

    private void preOrder(Node root, String temp, ArrayList<String> list) {
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            list.add(temp);
            return;
        }

        preOrder(root.left, temp + '0', list);
        preOrder(root.right, temp + '1', list);
    }
}