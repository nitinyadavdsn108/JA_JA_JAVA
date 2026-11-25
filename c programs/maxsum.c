#include <stdio.h>

int main()
{
    int arr[6] = {3, 0, 1, 2, 3, 3};

    for (int i = 0; i < 6; i++)
    {
        printf("%d\t", arr[i]);
    }

    printf("\n");

    /* find the maximum sum of size 3 window */

    int size = 4;
    int sum = 0;
    int maxSum = 0;

    /*  for (int i = 0; i < 6 - size + 1; i++)
     {
         sum = 0;
         for (int j = i; j < size + i; j++)
         {
             sum = sum + arr[j];
         }

         printf("curretn sum : %d\n", sum);

         if (sum > maxSum)
         {
             maxSum = sum;
         }
     }
  */

    /* optimized version */

    for (int k = 0; k < size; k++)
    {
        sum = sum + arr[k];
        printf("%d ,", sum);
    }

    for (int i = 0; i < 6 - size; i++)
    {
        sum = sum + arr[i + size] - arr[i];
        printf("current sum : %d\n", sum);
        if (maxSum < sum)
        {
            maxSum = sum;
        }
    }

    printf("Maximum sum is : %d\n", maxSum);

    /*  int size = 6;
     int sum = 0;
     int i = 0;
     int j = i + size - 1;

     /* find sum of first window elements */
    /*     for (int k = 0; k < size; k++)
        {
            sum = sum + arr[k];
        }

        printf("%d , i : %d , j : %d \n", sum, i, j);
     */
    /* intiallly max and sum be same  */
    /*     int max = sum;

        while (j < 5)
        {
            sum = sum + arr[j + 1] - arr[i];
            if (sum > max)
            {
                max = sum;
            }
            i++;
            j++;

            printf("%d , i : %d , j : %d \n", sum, i, j);
        }

        printf("maximum sum : %d", max); */
    return 0;
}