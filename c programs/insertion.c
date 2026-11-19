#include <stdio.h>

void merge(int arr[], int low, int mid, int high)
{
    int i = low;
    int j = mid + 1;
    int k = 0;
    int temp[high - low + 1];
    while (i <= mid && j <= high)
    {
        if (arr[i] <= arr[j])
        {
            temp[k] = arr[i];
            i++;
        }
        else
        {
            temp[k] = arr[j];
            j++;
        }

        k++;
    }

    // copy the remaining ele from this unexhausted array

    while (i <= mid)
    {
        temp[k] = arr[i];
        k++;
        i++;
    }

    while (j <= high)
    {
        temp[k] = arr[j];
        k++;
        j++;
    }

    for (int x = 0; x < k; x++)
    {
        arr[low + x] = temp[x];
    }
}

void divide(int arr[], int low, int high)
{
    // base condtion
    if (low >= high)
    {
        return;
    }
    else
    {
        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

int main()
{

    int arr[8] = {5, 7, 3, 4, 8, 6, 1, 2};

    for (int i = 0; i < 8; i++)
    {
        printf("%d\t", arr[i]);
    }

    divide(arr, 0, 7);

    printf("\n");

    for (int i = 0; i < 8; i++)
    {
        printf("%d\t", arr[i]);
    }
}