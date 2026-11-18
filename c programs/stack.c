#include <stdio.h>
#define SIZE 5

int stack[SIZE];
int top = -1;

void push(int val)
{
    if (top == SIZE - 1)
    {
        printf("stack is full");
    }
    else
    {
        stack[++top] = val;
    }
}

void pop()
{
    if (top == -1)
    {
        printf("stack is empty");
    }
    else
    {
        printf("\n%d is removed from stack", stack[top]);
        top--;
    }
}

void display()
{
    if (top == -1)
    {
        printf("stack is empty");
    }
    else
    {

        printf("\n");
        for (int i = top; i >= 0; i--)
        {
            printf("%d ", stack[i]);
        }
    }
}

int main()
{
    push(20);
    push(40);
    push(60);
    display();
    pop();
    display();
    push(100);
    push(200);
    push(700);
    push(900);
    display();
}