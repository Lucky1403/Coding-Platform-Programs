import java.util.HashSet;

class Solution {
    public boolean isPathCrossing(String path) {

        HashSet<String> set = new HashSet<>();

        int x = 0;
        int y = 0;

        set.add(x + "," + y);

        for (char ch : path.toCharArray()) {

            if (ch == 'N')
                y++;
            else if (ch == 'S')
                y--;
            else if (ch == 'E')
                x++;
            else
                x--;

            String current = x + "," + y;

            if (set.contains(current))
                return true;

            set.add(current);
        }
        return false;
    }
}