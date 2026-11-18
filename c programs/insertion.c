#include <stdio.h>

int main()
{
    int n = 5;

    int arr[5] = {5, 3, 4, 1, 2};

    for (int i = 0; i < n - 1; i++)
    {
        int ele = arr[i + 1];
        int j = i;

        while (j >= 0 && arr[j] > ele)
        {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = ele;
    }

    for (int i = 0; i < 5; i++)
    {
        printf("%d\t", arr[i]);
    }

    /* insertion sort */
}