#include <stdio.h>

void merge(int arr[], int start, int mid, int end)
{
    // pointers
    int i = start, j = mid + 1, k = 0;
    // array causing this algo to be not in-place
    int temp[end - start + 1];

    while (i <= mid && j <= end)
    {

        // this line arr[i]<=arr[j] confirms that relative position of duplicates are maintained

        if (arr[i] <= arr[j])
        {
            temp[k] = arr[i++];
        }
        else
        {
            temp[k] = arr[j++];
        }

        k++;
    }

    while (i <= mid)
    {
        temp[k++] = arr[i++];
    }

    while (j <= end)
    {
        temp[k++] = arr[j++];
    }

    // elements are sorted in this temp array
    // copy them back to original array
    // arr[start+ index] = temp[index]

    for (int x = 0; x < k; x++)
    {
        arr[start + x] = temp[x];
    }
}

void mergeSort(int arr[], int start, int end)
{
    if (start >= end)
        return;

    int mid = (start + end) / 2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);

    merge(arr, start, mid, end);
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

    mergeSort(arr, 0, n - 1);
    // passing the arr and start and endijng index

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
}