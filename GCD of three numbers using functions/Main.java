#include <stdio.h>
int gcd(int a,int b)
{
  if(b==0)
    return a;
  else
    return gcd(b,a%b);
}
int main() {
	//Type your code here
  int a,b,c,r,res;
  scanf("%d%d%d",&a,&b,&c);
  r=gcd(a,b);
  res=gcd(r,c);
  printf("%d",res);
	return 0;
}