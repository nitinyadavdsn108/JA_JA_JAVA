#include <stdio.h>

int main()
{
    int n = 6;

    int arr[6] = {11, 2, 13, 4, 15, 6};

    for (int i = 0; i < 6; i++)
    {
        printf("%d\t", arr[i]);
    }

    int temp;

    /* index of minimum element */
    int min = 0;

    /* selection sort */
    /* in each iteration , find the smallest element in remaining portion of array .
    in-place : yes , no extra array is used.
    stable : no, relative position of same elements gets changed.

    */

    for (int i = 0; i < n; i++)
    {
        printf("\n%d :", i);
        min = i;

        for (int j = i + 1; j < n; j++)
        {
            printf("%d\t", j);

            if (arr[min] > arr[j])
            {
                min = j;
            }
        }

        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    printf("\nArray elements:\n");

    for (int i = 0; i < 6; i++)
    {
        printf("%d\t", arr[i]);
    }

    /* bubble sort */
    /* best case : array already sorted then  we use a boolean variable swap that will turn true if a swap happens in any iterations
                   if the swap happens then array was not sorted but if it wasnt turned and remain false that means array was sorted.
                   ...then it takes O(n) time since the inner loop runs for once.
        avg case :  O(n2)
        worst case : O(n2)

   sapce comp : auxiliary space it talkes , it is using constants thats all so O(1) space
   stable : yes , it is stable since its relative positioning of duplicate/identical elements remains same.

        */

    /*     for (int i = 0; i < n - 1; i++)
        {

            printf("\n%d :", i);
            for (int j = 0; j < n - i - 1; j++)
            {
                printf("%d\t", j);
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printf("\nArray elements:\n");

        for (int i = 0; i < 6; i++)
        {
            printf("%d\t", arr[i]);
        }
     */

    /* int n;
    int sum = 0;
    scanf("%d", &n);

    /* find factors of this number */
    /*   for (int i = 1; i <= n; i++)
      {
          if (n % i == 0)
          {
              /* i is a factor */
    /*            printf("%d\t", i);
               sum = sum + i;
           }
       }

       printf("\n%d", sum);
    */
    return 0;
}