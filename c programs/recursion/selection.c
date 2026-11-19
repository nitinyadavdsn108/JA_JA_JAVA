#include <stdio.h>

int findMin(int arr[], int ind, int min, int e)
{
    if (ind > e)
        return min;

    // update min index when find a smaller element
    if (arr[ind] < arr[min])
    {
        min = ind;
    }

    return findMin(arr, ind + 1, min, e);
}

void SelectionSort(int arr[], int start, int end)
{
    if (start >= end)
        return;

    // how to find minimum element using recursion

    int min = findMin(arr, start + 1, start, end);

    /*     while (i <= end)
    {
        if (arr[i] < arr[min])
        {
            min = i;
        }
        i++;
    } */

    // swap arr[start] with current minInd
    int temp = arr[start];
    arr[start] = arr[min];
    arr[min] = temp;

    SelectionSort(arr, start + 1, end);
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

    SelectionSort(arr, 0, n - 1);
    // passing the arr and start and ending index

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
}