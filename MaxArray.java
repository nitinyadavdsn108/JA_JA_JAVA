import java.util.Scanner;

class MaxArray{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size :");
        int n = scn.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

         for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }

        int MAX = arr[0];
        for(int i=0 ; i < n ; i++){
         
            for(int j=i+1 ; j < n ; j++){
               if(MAX < arr[j])
                  MAX = arr[j];
            }
        }

        System.out.println("largest element found in array is "+MAX);
        
    }
}