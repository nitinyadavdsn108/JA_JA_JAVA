import java.util.Scanner;
public class print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hello");/* 
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *"); */

        for(int i = 0 ; i<= 5 ; i++){
            for(int j = 0 ; j<= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        System.out.println("* * * * * *");

        for(int i = 6 ; i>=0 ; i--){
            for(int j = 0 ; j < i-1 ; j++){

                if(i==2){
                 System.out.println("* * * * * *");
                }
               
                else if(j==i-2){

                    System.out.print("* ");
           
                }else{
                    System.out.print("  ");
                } 
            }
            
                System.out.println();
       
            
        
        }
       

    }
}