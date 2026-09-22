public class PrimeRange {
    public static void main(String[] args) {

        int sum = 0;
        int start = 10;
        int end = 20;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println(sum);

    }

    static boolean isPrime(int n) {

        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }

}
