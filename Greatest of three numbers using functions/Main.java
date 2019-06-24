#include <stdio.h>
int large(int a,int b)
{
  if(a>b)
    return a;
  else
    return b;
}
  
int main(){
	// Type your code here
  int a,b,c,res,r;
  scanf("%d%d%d",&a,&b,&c);
  res=large(a,b);
  r=large(res,c);
  printf("%d",r);
  	return 0;
}