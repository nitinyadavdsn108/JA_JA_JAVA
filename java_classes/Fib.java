public class Fib {

    static int fib(int[] dp, int n) {
        if (n == 0) {
            dp[n] = 0;
            return 0;
        }

        if (n == 1) {
            dp[n] = 1;
            return 1;
        }

        if (dp[n - 1] != -1 && dp[n - 2] != -1) {
            return dp[n - 1] + dp[n - 2];
        }

        return fib(dp, n - 1) + fib(dp, n - 2);
    }

    public static void main(String[] args) {
        int n = 20;

        int[] dp = new int[n];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(fib(dp, i));
        }

    }
}
