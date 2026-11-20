#include <stdio.h>

void selection(int arr[], int s, int e)
{
    if (s >= e)
    {
        return;
    }

    int min = s;
    for (int i = s + 1; i < e; i++)
    {
        if (arr[i] < arr[min])
        {
            min = i;
        }
    }

    if (arr[s] > arr[min])
    {
        int temp = arr[s];
        arr[s] = arr[min];
        arr[min] = temp;
    }

    selection(arr, s + 1, e);
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

    selection(arr, 0, 8);
    for (int i = 0; i < 8; i++)
    {
        printf("%d\t", arr[i]);
    }
    return 0;
}