import java.util.Scanner;

class MaxArray{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size :");
        int n = scn.nextInt();
        
        int arr[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

         for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}