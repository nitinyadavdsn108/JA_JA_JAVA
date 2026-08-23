import java.util.Scanner;

public class fiboSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nthVal = scn.nextInt();
        int a = 0;
        int b = 1 ;
        int c ;

        for(int i = 0 ; i < nthVal ; i++ ){
            if( i == 0){
                System.out.print(a+" ");
            }
            else if( i == 1){
                System.out.print(b+" ");
            }
            else {
                c = a + b ;
                a = b ;
                b = c ;
                System.out.print(c+" ");
            }
           
        }
    }
}
