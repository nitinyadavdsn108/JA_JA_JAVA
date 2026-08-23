import java.util.Scanner;

public class lcm {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("you must give a valid numbers as an input :");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int min,max, rem = 1;

        
        // do the compare
        if(num1 < num2){
            min = num1;
            max = num2;
        }else{
            min = num2;
            max= num1;
        }
        while(rem!=0){
            rem = max%min;
            max = min;
            min = rem;
        }

        int gcd = max ;
        int lcm = ( num1 * num2 ) / gcd ;
        System.out.println("least common multiple is : "+lcm);
      
    }

}
