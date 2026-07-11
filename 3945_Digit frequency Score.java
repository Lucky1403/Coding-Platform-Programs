import java.util.HashMap;
import java.util.Map;

class Solution {
    public int digitFrequencyScore(int n) {
        String string = String.valueOf(n);

        HashMap<Character, Integer> frequency = new HashMap<>();

        for(char ch : string.toCharArray())
        {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        int sum = 0;
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) 
        {
            char character = entry.getKey();
            int characterValue = Character.getNumericValue(character);
            int frequencyValue = entry.getValue();

            sum += characterValue * frequencyValue;
        }

        return sum;
    }
}