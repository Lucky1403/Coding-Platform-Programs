import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C") || operations[i].equals("D") || operations[i].equals("+")) {
                if (operations[i].equals("C")) {
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                }
                if (operations[i].equals("D")) {
                    if (!st.isEmpty()) {
                        int number = st.peek();
                        st.push(2 * number);
                    }
                }
                if (operations[i].equals("+")) {
                    if (st.size() >= 2) {
                        int a = st.pop();
                        int b = st.peek();
                        int c = a + b;
                        st.push(a);
                        st.push(c);
                    }
                }
            } else {
                int ConvertedInteger = Integer.parseInt(operations[i]);
                st.push(ConvertedInteger);
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}