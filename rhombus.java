import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // intiliaze outer and inner space
        int outspace = n/2 ;
        int innerspace = -1 ;
        for(int i = 0 ; i < n ; i++){


            for(int j = 0 ; j < outspace ; j++)
                System.out.print("  ");

            
            System.out.print(" *");

            for(int j = 0 ; j < innerspace ; j++)
                System.out.print("  ");

            if( i > 0 && i < n-1)
            System.out.print(" *");

            
            if( i < n/2){
                outspace--;
                innerspace += 2;
            
            }else{
                outspace++;
                innerspace -= 2;
            }

            System.out.println();
                
        }
    }
}
