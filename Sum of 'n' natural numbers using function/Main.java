#include<stdio.h>
int son(int n)
{
  return n*(n+1)/2;
}
int main() {
    // Type your code here
  int n,res;
  scanf("%d",&n);
  res=son(n);
  printf("%d",res);
  	return 0;
}