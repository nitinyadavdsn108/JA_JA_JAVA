import java.util.Scanner;
public class countPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter low value");
        int low = input.nextInt();
        System.out.println("enter high value");
        int high = input.nextInt();


        int isPrime = 0;

        for(int n = low ; n <= high ; n++){
            /// to check each of these numbers are prime or not
        
            int count = 0;

            for(int j = 2 ; j*j <= n ; j++){
                if(n%j == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println(n+" is a prime");
                isPrime++;
            }


        }

        System.out.println("number of primes are"+isPrime );
    
    }
}