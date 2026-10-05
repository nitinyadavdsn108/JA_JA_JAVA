import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = 50 + 30 + "TEST" + 40 + 60 + "PROG";
        System.out.println(res);
        String ch = sc.nextLine();

        checkVowel(ch);

    }

    static void checkVowel(String ch) {
        if (ch.length() != 1) {
            System.out.println("not a sinlge character");
            return;
        }

        ch = ch.toLowerCase();
        if ((ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z')) {
            if ((ch.charAt(0) == 'a') || (ch.charAt(0) == 'e') || (ch.charAt(0) == 'i') || (ch.charAt(0) == 'o')
                    || (ch.charAt(0) == 'u')) {
                System.out.println("vowel");
            } else {
                System.out.println("not a vowel");
            }

        } else {
            System.out.println("not a valid character");
        }
    }

}
