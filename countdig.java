import java.util.Scanner;

public class countdig {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 1 ;
        int Number = scn.nextInt();
        int n = Number;
        while(n/10 != 0){
            count++;
            n = n/10;
        }
        
        System.out.println("Number of digits in "+Number+" are : "+count);
    }
}
