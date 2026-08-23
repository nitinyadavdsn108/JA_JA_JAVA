import java.util.Scanner;

public class hollowDiamond {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = (n/2) + 1 ;
        int space = 1;

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < star ; j++){
                System.out.print(" *");
            }

            
            for(int j = 0 ; j < space ; j++){
                System.out.print("  ");
            }

            for(int j = 0 ; j < star ; j++){
                System.out.print(" *");
            }

            if( i < n/2){
                star = star - 1;
                space = space + 2;
            }else{
                star = star + 1 ;
                space = space - 2 ;
            }

            System.out.println();
        }
     
    }
    
}
