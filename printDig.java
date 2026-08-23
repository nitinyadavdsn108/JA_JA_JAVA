import java.util.Scanner;

public class printDig {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = num;
        int digits = 1 ;

        while(n/10 != 0){
            digits++;
            n = n/10 ;
        }

        System.out.println("Number of digits in number "+digits);
        n = num;

        int placeVal;

        for( int i = digits-1 ; i >= 0 ; i--){

            placeVal = (int) (n/(Math.pow(10, i))) ;
            n = (int) (n%(Math.pow(10,i)));
            System.out.println(placeVal);
        }

    }
}
