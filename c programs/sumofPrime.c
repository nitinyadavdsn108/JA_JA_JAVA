#include <stdio.h>
#define SIZE 5

int main()
{
    int n;
    int count;
    int sum = 0;
    scanf("%d", &n);

    printf("Range of prime numbers : ");
    /* input number must be greater than or equal to 2 since two is the smallest prime number */

    for (int i = 2; i <= n; i++)
    {
        count = 0;
        for (int j = 1; j * j <= i; j++)
        {

            if (i % j == 0)
            {
                count++;
            }
        }

        if (count == 2)
        {
            /* prime number */
            printf("%d\t", i);

            sum = sum + i;
        }
    }

    printf("\nThe sum of prime numbers occuring in this range is : %d\t", sum);

    return 0;
}