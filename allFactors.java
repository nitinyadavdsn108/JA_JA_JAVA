import java.util.Scanner;

public class allFactors {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("you must give a valid numbers as an input :");
        int num = scn.nextInt();

        int i = 2 ;
        int n = num;
        while(n > 1){
            if(n%i == 0){
                System.out.print(i+"* ");
                n = n/i;
            }else{
                i++;
            }

        }

    }
}
