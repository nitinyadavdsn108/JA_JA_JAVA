#include <stdio.h>

int partition(int arr[], int start, int end)
{
    int pivot = end;
    int ind = start - 1;
    int temp;

    for (int i = start; i < end; i++)
    {
        if (arr[i] < arr[pivot])
        {
            ind++;
            // swap ele of  ind with i
            temp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp;
        }
    }

    // whole loop iterated and we got boundary of smaller elements
    // ind+1 is the position where piovt should be placed.
    // swapping elements at ind+1 and at pivot
    temp = arr[pivot];
    arr[pivot] = arr[ind + 1];
    arr[ind + 1] = temp;

    // pivot is at its correct position
    // now we should return its index back
    return ind + 1;
}

void quickSort(int arr[], int start, int end)
{
    if (start >= end)
        return;

    int pivot = partition(arr, start, end);
    quickSort(arr, start, pivot - 1);
    quickSort(arr, pivot + 1, end);
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

    quickSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
}