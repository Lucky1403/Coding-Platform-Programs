import java.util.Scanner;

class GFG {
    public static int findSum(int n)
    {
        if(n == 1)
            return 1;
        if(n == 0)
            return 0;
        return n + findSum(n -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(findSum(n));
        sc.close();
    }
}