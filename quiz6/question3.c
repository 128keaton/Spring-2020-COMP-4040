/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

void
swap (int a, int b)
{
  int temp;
  temp = a;
  a = b;
  b = temp;
}

void
main ()
{
  int value = 2, list[5] = { 1, 3, 5, 7, 9 }, loop;
  
  printf("----------------\n");
  swap (value, list[0]);
  printf ("%d\n", value);
  for(loop = 0; loop < 5; loop++)
      printf("%d ", list[loop]);

  printf("\n----------------\n");
  swap (list[0], list[1]);
  printf ("%d\n", value);
  for(loop = 0; loop < 5; loop++)
      printf("%d ", list[loop]);

  printf("\n----------------\n");
  swap (value, list[value]);
  printf ("%d\n", value);
  for(loop = 0; loop < 5; loop++)
      printf("%d ", list[loop]);

}

