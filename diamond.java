import java.util.Scanner;

public class diamond {
 
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // diamond shape 
        /*  n = 5
        i = 0  then r1 = 2 space 1 star 2 space

        i = 1  then r2 = 1 space 3 star 1 space

        i = 2  then r3 = 0 space 5 star 0 space

        i = 3  then r4 = 1 space 3 star 1 space

        i = 4 then  r5 = 2 space 1 star 2 space
        
        */

        int space = n/2 ;
        int star = 1;

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < space ; j++){
                System.out.print("  ");
            }

            for(int j = 0 ; j < star ; j++){
                System.out.print(" *");
            }


            if(i < n/2){
                space--;
                star = star + 2;
            }else{
                space++;
                star = star - 2 ;
            }

            System.out.println();
        }

    }
}
