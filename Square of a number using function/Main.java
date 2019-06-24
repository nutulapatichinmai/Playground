#include<stdio.h>
int square(int n)
{
  return n*n;
}
int main() {
   // Type your code here
  int n,sq;
  scanf("%d",&n);
  sq=square(n);
  printf("%d",sq);
   return 0;
}