#include <stdio.h>

void bubble(int arr[], int e)
{
    if (e < 0)
    {
        return;
    }

    for (int i = 0; i < e - 1; i++)
    {

        if (arr[i] > arr[i + 1])
        {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    bubble(arr, e - 1);
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

    bubble(arr, 8);

    for (int i = 0; i < 8; i++)
    {
        printf("%d\t", arr[i]);
    }
    return 0;
}