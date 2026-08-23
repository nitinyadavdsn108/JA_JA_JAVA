import java.util.Scanner;

public class allDiagonals {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

     /* 
        //left tilted diagonal
        for(int i = 0 ; i < n ; i++){
            for( int j = 0 ; j < n ; j++){
                if( i == j )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        } */

         
         /* 
            // right tilted diagonal
            for(int i = n-1 ; i >= 0 ; i--){
                for( int j = 0 ; j <= i ; j++){
                    if( i == j )
                        System.out.print(" *");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
          */  
         

            // a cross pattern
            


    }
    
}
