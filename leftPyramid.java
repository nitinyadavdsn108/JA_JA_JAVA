import java.util.Scanner;

public class leftPyramid {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
/* 
// left pyramid

   for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("+ ");
            }
            System.out.println();
        } 
*/

/*             
// left and inverted pyramid

for(int i = 0 ; i < n ; i++){
                for(int j = n ; j > i ; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
 */


/*             // right pyramid
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j< n ; j++){
                    if( j < n-i-1)
                        System.out.print("  ");
                    else
                       System.out.print(" *");
                }
                System.out.println();
            }
 */  



/* 
            // inverted right pyramid
            for( int i = 0 ; i < n ; i++){
                for( int j = n ; j > 0 ; j--){
                    if(j > n-i){
                       System.out.print("  ");
                    }else{
                        System.out.print(" *");
                    }
                }
                System.out.println();
            }

 */ 




        }
    
}
