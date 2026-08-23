import java.util.Scanner;

public class gcd {
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

        // the last max value is the actual gcd i.e the smallest number that can divide both the given number
        System.out.println("the smallest number that divides both is : "+max);
      
    }
    
}
