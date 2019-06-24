#include<stdio.h>
int prime(int n)
{
  int prm,j,i;
  for(i=2;i<=n;i++)
  {
    prm=1;
    for(j=2;j<=i/2;j++)
    {
      if(i%j==0)
      {
        prm=0;
        break;
      }
    }
    if(prm==1)
      printf("%d\n",i);
  }
}
void main()
{
  int n,res;
  scanf("%d",&n);
  prime(n);
  
}