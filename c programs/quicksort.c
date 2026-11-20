#include <stdio.h>

void quicksort(int arr[], int start, int end)
{
    if (start >= end)
    {
        return;
    }

    int pivot = partition(arr, start, end);
    quicksort(arr, start, pivot - 1);
    quicksort(arr, pivot + 1, end);
}

int partition(int arr[], int s, int e)
{
    int pivot = e;
    for (int i = s; i <= e; i++)
    {
        if (arr[pivot] > arr[i])
        {
            j++;
        }
        else
        {
        }
    }
}

int main()
{

    int arr[8] = {7, 8, 12, 15, 18, 2, 4, 10};

    for (int i = 0; i < 8; i++)
    {
        printf("%d\t", arr[i]);
    }

    // selection sort : what do we do here...
    // find minimum in unsorted portion of arr
    // swap it with  current position ele

    /* int min;

    for (int i = 0; i < 8; i++)
    {
        min = i;
        for (int j = i + 1; j < 8; j++)
        {
            if (arr[j] < arr[min])
            {
                min = j;
            }
        }
        if (arr[i] > arr[min])
        {
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


 */

    printf("\n");

    quicksort(arr, 0, 7);

    for (int i = 0; i < 8; i++)
    {
        printf("%d\t", arr[i]);
    }
    return 0;
}