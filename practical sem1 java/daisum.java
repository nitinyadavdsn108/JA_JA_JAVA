public class daisum {
    public static void main(String[] args) {
        /* a daisum is a number which follows : 175 = 1^1+7^2+5^3 same as 175 */
        int number = 175;
        int countdig = 0;
        int temp = number;
        while (temp > 0) {
            temp = temp / 10;
            countdig++;
        }
        System.out.println(countdig);

        int sum = 0, i = 0;
        temp = number;
        while (temp > 0) {
            int dig = temp % 10;

            System.out.print(dig + " : " + Math.pow(dig, countdig - i));

            sum += Math.pow(dig, countdig - i);

            i++;

            temp = temp / 10;

            System.out.println("  : " + sum);
        }
        System.out.println(sum);

        if (sum == number) {
            System.out.println(number + " is daisum");
        } else {
            System.out.println(number + " is not daisum");
        }
    }
}