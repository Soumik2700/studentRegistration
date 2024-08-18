public class sumOfN {
    public static void addition(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        addition(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int n = 5;
        addition(1, n, 0);
    }
}
