#include <stdio.h>

void shift(int arr[], int ele, int bck)
{

    if (bck < 0 || arr[bck] <= ele)
    {
        arr[bck + 1] = ele;
        return;
    }

    else
    {
        if (arr[bck] > ele)
        {
            arr[bck + 1] = arr[bck];
        }

        shift(arr, ele, bck - 1);
    }
}

void insertionSort(int arr[], int s, int e)
{

    if (s > e)
    {
        return;
    }

    int ele = arr[s];

    shift(arr, ele, s - 1);
    insertionSort(arr, s + 1, e);
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

    insertionSort(arr, 1, n - 1);
    // passing the arr and start and ending index

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
}