#include<stdio.h>
#include<math.h>
int exponent(int a,int b)
{
  return pow(a,b);
}
int main(){
    // Type your code here
  int base,exp,res;
  scanf("%d%d",&base,&exp);
  res=exponent(base,exp);
  printf("%d",res);
  	return 0;
}