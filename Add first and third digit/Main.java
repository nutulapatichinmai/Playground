#include<stdio.h>
int main()
{
  int n1,n,n2,res;
  //Type your code here
  scanf("%d",&n);
  n1=n%10;
  n=n/10;
  n2=n/10;
  res=n1+n2;
  printf("%d",res);
  
  
  return 0;
}