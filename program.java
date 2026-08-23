import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

    for(int i = 0 ; i < t ; i++){
        int n = input.nextInt();

        int count = 0 ;

        for(int j = 2 ; j*j <= n ; j++){

            if(n%j == 0){
                count++;
                break;
            }
        }

        if(count == 2){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }

    }
        
    }
}