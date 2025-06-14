public class recursion_power {
    public static int power(int n, int x) {
        if (n == 0) {
            return 1;
        } else if (x == 0) {
            return 1;
        }
        int pown1 = power(n - 1, x);

        int pow = x * pown1;
        return pow;
    }

    public static void main(String[] args) {
            System.out.println(power(2, 5));
    }

}
