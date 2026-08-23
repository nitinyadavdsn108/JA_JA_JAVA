import java.util.Scanner;

public class rotate {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("you must give a valid number as an input :");
        int num = scn.nextInt();
      
        System.out.println("rotational value as an input :");
        int r = scn.nextInt();

        // 27391 is given to rotate by one time then the leftmost digit will be rotated to the rightmost place
        // 27391 rotated by 1 means 1-2739
        // 27391 rotated by 2 means 91-273
        // 27391 rotated by 3 means 391-27
        // 27391 rotated by 4 means 7391-2
        // 27391 rotated by 5 means 27391-0

        // first count the number of digits in given number
        int n = num;
        int count = 0 ;
        while(n!=0){
            n = n/10;
            count++;
        }

        // to fasten up the coding and prevent redoing same thing again and again
         // take modulus of 'r' i.e. rotaional value
         // r % count

        r = r % count ;  

        // to handle negative rotaions 
        // incase of a 4 digit number ----> -1 == +3 , -2 == +2 , -3 == +1 , -4 == 0 
        
        if( r < 0){
            r = r + count;
        }
        
        n = num;
        int last_digit = 0;

        while(r!=0){
            last_digit = n % 10;
            n = n/10;
            n = n + (int)Math.pow(10, count-1)*last_digit ;
            r--;
        }

        System.out.println("rotated value is :"+n);

    }
    
}
