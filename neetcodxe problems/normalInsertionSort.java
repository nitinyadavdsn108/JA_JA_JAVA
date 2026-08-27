import java.util.Scanner;

public class normalInsertionSort{
    public static void main(String[] args) {
        int[] arr ;
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = scn.nextInt();
        }
 
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        
        
// doing the insertion sort
for(int i=1;i<size;i++){
// storing ith val in curr variable
int curr = arr[i];
int j = i-1;
while(j>=0 && arr[j] > curr){
               arr[j+1] = arr[j];
               j--;
    }
    arr[j+1] = curr;
    
}

        // sorted array
        System.out.print("the sorted array : ");
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

}


}