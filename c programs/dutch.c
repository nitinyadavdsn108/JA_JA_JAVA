#include <stdio.h>
int main()
{
    int arr[3] = {2, 0, 1};

    for (int i = 0; i < 3; i++)
    {
        printf("%d\t", arr[i]);
    }

    printf("\n");

    int low = 0;
    int mid = 0;
    int high = 2;

    int temp;

    while (mid <= high)
    {
        if (arr[mid] == 0)
        {
            // swap arr[mid] with arr[low]
            temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;

            mid++;
            low++;
        }

        if (arr[mid] == 1)
        {
            mid++;
        }

        if (arr[mid] == 2)
        {
            // swap arr[mid] with arr[high]
            temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }

        for (int i = 0; i < 3; i++)
        {
            printf("%d\t", arr[i]);
        }

        printf("\n");
    }

    for (int i = 0; i < 3; i++)
    {
        printf("%d\t", arr[i]);
    }

    return 0;
}