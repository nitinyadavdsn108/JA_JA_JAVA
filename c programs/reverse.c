#include <stdio.h>
int main()
{
    int arr[5];
    int n = sizeof(arr) / sizeof(int);

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    return 0;
}
