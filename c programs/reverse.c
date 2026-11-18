#include <stdio.h>

int main()
{
    int arr[6] = {1, 2, 3, 4, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Array elements:\n");

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    int mid = n / 2;
    int temp;

    for (int i = 0; i < mid; i++)
    {
        /* swap */
        temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
    }

    printf("\nreversed array is : ");

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    return 0;
}