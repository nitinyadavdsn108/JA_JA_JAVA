#include <stdio.h>

void bubbleSort(int arr[], int n)
{
    if (n <= 1)
        return;

    int i = 0;
    while (i < n - 1)
    {
        if (arr[i] > arr[i + 1])
        {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        i++;
    }

    bubbleSort(arr, n - 1);
}

int main()
{
    int arr[] = {10, 5, 3, 2, 9, 8, 1, 7, 6};

    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    printf("\n");

    bubbleSort(arr, n);
    // passing the arr and start and ending index

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
}