import java.util.*;

class Pair implements Comparable<Pair>
{
    int number;
    char character;
    Pair(int number, char character)
    {
        this.number = number;
        this.character = character;
    }

    public int compareTo(Pair p){
        return Integer.compare(this.number, p.number);
    }
}

class Solution {
    public String restoreString(String s, int[] indices) {
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < indices.length; i++)
            list.add(new Pair(indices[i], s.charAt(i)));
        
        Collections.sort(list);

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < list.size(); i++)
            answer.append(list.get(i).character);
        
        return answer + "";
    }
}