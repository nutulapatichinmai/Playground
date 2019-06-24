#include <stdio.h>
int fact(int n)
{
  int i,fact=1;
  for(i=1;i<=n;i++)
    fact=fact*i;
  return fact;
}
int main() {
	//Type your code
  int n,n1,temp,sum=0;
  scanf("%d",&n);
  n1=n;
  while(n1!=0)
  {
    temp=n1%10;
    sum+=fact(temp);
    n1=n1/10;
  }
  if(sum==n)
    printf("Yes");
  else
    printf("No");
  
	return 0;
}