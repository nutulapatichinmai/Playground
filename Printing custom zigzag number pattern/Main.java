#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(j=1;j<=n;j++)
      {
        if(j<n)
          printf("%d",i);
        else
          printf("%d",i+1);
      }
    }
    else if(i%2==0)
    {
      for(j=1;j<=n;j++)
      {
        if(j==1)
          printf("%d",i+1);
        else
          printf("%d",i);
      }
    }
    printf("\n");
  }
}
   
     