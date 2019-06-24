#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size,arr[20],i,j,k,count=0,b[20];
  scanf("%d",&arr_size);
  for(i=0;i<arr_size;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<arr_size;i++)
  {
    if(arr[i]==0)
      count++;
    else
    {
      b[j]=arr[i];
      j++;
    }
  }
  for(int k=0;k<j;k++)
  {
    printf("%d ",b[k]);
  }
  for(int j=0;j<count;j++)
  {
    printf("0 ");
  }
      
  
  return 0;
}