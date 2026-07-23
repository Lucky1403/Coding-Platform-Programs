class Solution {
    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();

        return reversedString;
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");

        int arr[] = new int[words.length];

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            int vowelCount = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                        || word.charAt(i) == 'u') {
                    vowelCount++;
                }
                arr[w] = vowelCount;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[0]) {
                words[i] = reverseString(words[i]);
            }
        }

        String result = String.join(" ", words);
        return result;
    }
}