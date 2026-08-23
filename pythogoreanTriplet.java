import java.util.*;

public class pythogoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int sa = a*a;
        int sb = b*b;
        int sc = c*c;
        if(sa+sb == sc){
            System.out.println("yes three numbers are pythagorean triplets");
        }

        else if(sa+sc == sb){
            System.out.println("yes three numbers are pythagorean triplets");
        }
        else if(sc+sb == sa){
            System.out.println("yes three numbers are pythagorean triplets");
        }
        else{
            System.out.println("No not triplets");
        }
        
    }
    
}
