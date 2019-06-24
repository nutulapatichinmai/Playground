#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,a[10],key1,key2,found,j,loc;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  	scanf("%d",&a[i]);
  scanf("%d",&key1);
  scanf("%d",&key2);
  for(i=0;i<n;i++)
  {
    if(a[i]==key1)
    {
      found=1;
      break;
    }
    else
      found=0;
  }
  if(found==1)
    printf("%d",i);
  for(i=1;i<n;i++)
  {
    if(a[i]==key2)
    {
      found=1;
      break;
    }
    else
      found=-1;
  }
  if(found==1)
    printf("\n%d",i);
  else
    printf("\n%d",found);
    
    
  return 0;
}