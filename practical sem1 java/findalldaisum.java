public class findalldaisum {
    public static void main(String[] args) {
        int daisumCount = 0;

        for (int num = 1; num <= 1000; num++) {
            int countdig = 0;
            int temp = num;
            while (temp > 0) {
                temp = temp / 10;
                countdig++;
            }

            int sum = 0, i = 0;
            temp = num;
            while (temp > 0) {
                int dig = temp % 10;

                sum += Math.pow(dig, countdig - i);

                i++;

                temp = temp / 10;

            }

            if (sum == num) {
                System.out.println(num + " is daisum");
                daisumCount++;
            }
        }

        System.out.println("toatal number exist : " + daisumCount);
    }
}
