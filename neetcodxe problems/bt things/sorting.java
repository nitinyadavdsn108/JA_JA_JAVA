import java.util.Arrays;

class sorting {
    public static void main(String[] args) {
        int[] a = { 9, 4, 2, 3, 1, 8 };
        int n = a.length;
        int temp = 0;

        // bubble sort
        /*
         * for (int i = 0; i < n - 1; i++) {
         * for (int j = 0; j < n - i - 1; j++) {
         * if (a[j] > a[j + 1]) {
         * temp = a[j + 1];
         * a[j + 1] = a[j];
         * a[j] = temp;
         * }
         * 
         * }
         * }
         */
        /*
         * // selection sort
         * for (int i = 0; i < n - 1; i++) {
         * int min = i;
         * for (int j = i + 1; j < n; j++) {
         * if (a[min] > a[j]) {
         * min = j;
         * }
         * }
         * 
         * // swap
         * temp = a[i];
         * a[i] = a[min];
         * a[min] = temp;
         * 
         * System.out.println(Arrays.toString(a));
         * 
         * }
         */

        // insertion sort
        /*
         * for (int i = 1; i < n; i++) {
         * // take out current ith element
         * int current = a[i];
         * // start j with just one index before i
         * int j = i - 1;
         * 
         * while (j >= 0 && current < a[j]) {
         * a[j + 1] = a[j];
         * j--;
         * }
         * 
         * a[j + 1] = current;
         * 
         * }
         */
        /*
         * quickSort(a, 0, n - 1);
         */

        divide(a);

        System.out.println(Arrays.toString(a));

    }

    public static void divide(int[] a, int start, int end) {

        if (start >= end) {
            return;
        }
        // to remain in range of Integer i.e :

        int mid = start + (end - start) / 2;

        divide(a, start, mid);
        divide(a, mid + 1, end);

        conquer(a, start, mid, end);

    }

    public static void conquer(int[] a, int start, int mid, int end) {
        int[] res = new int[end - start + 1];

        int ind1 = start;
        int ind2 = mid + 1;

    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }

    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        // i will move whenever we found smaller ele then pivot
        int i = low - 1;
        int temp = 0;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                // swap
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        i++;
        // swap the last larger element with pivot
        temp = a[i];
        a[i] = a[high];
        a[high] = temp;

        // pivot would be on its proper position
        return i;

    }

}