public class minimumLengthOfSubarrays{
    public static void minSumOfLengths(int[] arr, int target) {
        int[] lengtharr = new int[arr.length];
        for (int i = 0; i < lengtharr.length; i++) {
            lengtharr[i] = 100;
        }
        int n = arr.length;
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if(sum == target){
                lengtharr[k++] =  1;
                continue;
            }
            if(i!=n-1){

            j = i + 1;
    
            }else{
                continue;
            }  
            
                 while (sum < target && j<n) {
                sum += arr[j];
                j++;
            }
            if (sum == target) {
                lengtharr[k++] = j - i + 1;
            }

        }


        for ( int l = 0; l < lengtharr.length; l++) {
            System.out.print(lengtharr[l]+" ");
        }


        int min = lengtharr[0] + lengtharr[1];

        for (int i = 0; i < n - 1; i++) {
            for (int t = i + 1; t < n; t++) {
              int  currentMin = lengtharr[i] + lengtharr[t];
                if (min > currentMin) {
                    min = currentMin;
                }

            }
        }

        System.out.println(min);

    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,4,3};
        minSumOfLengths(arr,3);
    }
}