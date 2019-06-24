#include<stdio.h>
int main()
{
  //fill the code
  int i,n,a[10],max;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  max=a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
  }
  printf("%d",max);
  return 0;
}