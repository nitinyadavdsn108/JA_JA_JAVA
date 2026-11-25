#include <stdio.h>

void merge(int arr[], int st, int mid, int end)
{
    if (st == end)
    {
        return;
    }
    else
    {
        int res[end - st + 1];

        int i = st;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end)
        {
            if (arr[i] < arr[j])
            {

                res[k] = arr[i];
                i++;
            }
            else
            {
                res[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            res[k++] = arr[i++];
        }
        while (j <= end)
        {
            res[k++] = arr[j++];
        }

        for (int i = st, k = 0; i <= end; i++, k++)
        {
            arr[i] = res[k];
        }

        for (int i = st; i <= end; i++)
        {
            printf("%d ", arr[i]);
        }
        printf("\n");
    }
}

void Divide(int arr[], int st, int end)
{
    if (st >= end)
    {
        return;
    }
    else
    {
        int mid = (st + end) / 2;
        Divide(arr, st, mid);
        Divide(arr, mid + 1, end);
        merge(arr, st, mid, end);
    }
}
int main()
{
    int arr[10] = {10, 40, 90, 50, 20, 30, 80, 70, 60, 100};

    Divide(arr, 0, 9);

    for (int i = 0; i < 10; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}