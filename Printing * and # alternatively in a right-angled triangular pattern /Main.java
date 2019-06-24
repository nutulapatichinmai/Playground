#include <stdio.h>
int main(){
	// Type your code here
   int n,i,j,k;
  scanf("%d",&n);
  k=0;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(k%2==0)
        printf("*");
      else
        printf("#");
      k++;
    }
    printf("\n");
  }
  	return 0;
}