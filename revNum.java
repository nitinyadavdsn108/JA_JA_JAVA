import java.util.Scanner;

public class revNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(num);

        // first count number of digits 
        int digits = 1 ;
        int n = num ;
        while( n/10 != 0){
            digits++;
            n = n/10 ;
        }
        System.out.println("Digits in number are : "+digits);

        n = num ;
        int newNum = 0;
        int lastDigit;

        // now the reverse part 

        for( int i = 0 ; i < digits ; i++){

            lastDigit = n%10;
            newNum = (newNum*10)+lastDigit;
            n = n/10;
        }
        System.out.println("Reversed number is :"+newNum);
    }
}
