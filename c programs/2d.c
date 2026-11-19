#include <stdio.h>

int main()
{
    int iarr[2][3] = {
        {1, 1, 1},
        {2, 2, 2}};

    int irow = 2;
    int icol = 3;
    int jrow = 3;
    int jcol = 2;

    int jarr[3][2] = {
        {1, 1},
        {2, 2},
        {3, 3}};

    printf("Array elements:\n");

    for (int i = 0; i < irow; i++)
    {
        for (int j = 0; j < icol; j++)
        {

            printf("%d\t", iarr[i][j]);
        }

        printf("\n");
    }

    printf("Array elements:\n");

    for (int i = 0; i < jrow; i++)
    {
        for (int j = 0; j < jcol; j++)
        {

            printf("%d\t", jarr[i][j]);
        }

        printf("\n");
    }

    /* matrix multiplication */

    int karr[irow][jcol];

    if (icol == jrow)
    {
        for (int i = 0; i < irow; i++)
        {
            for (int j = 0; j < jcol; j++)
            {
                for (int k = 0; k < ; k++)
                {
                }
            }
        }
    }

    return 0;
}