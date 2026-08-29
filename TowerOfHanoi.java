public class TowerOfHanoi{
    public static void main(String[] args) {
        hanoi(5, 'A', 'B', 'C');
    }

    public static void hanoi(int i, char a, char b, char c) {
        if(i == 0)
            return;
        hanoi(i - 1, a, c, b);
        System.out.println(a + " ->" + c);
        hanoi(i - 1, b, a, c);
    }
}

//For retunring only the maximum number of moves return 2 raise to power n - 1 as the result.