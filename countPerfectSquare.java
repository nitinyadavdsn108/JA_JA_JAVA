import java.util.Scanner;

public class countPerfectSquare {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i;
        for( i = 1 ; i*i <= n ; ++i){
        System.out.println("no of perfect squares uptil n are"+i*i);
        }
        System.out.println(i);
    }
    
}
