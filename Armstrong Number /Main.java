#include <stdio.h>
int main() {
	//Type your code
  int n,count=0,n1,res=0,rem;
  scanf("%d",&n);
  n1=n;
  while(n1!=0)
  {
    n1=n1/10;
    ++count;
  }
  n1=n;
  while(n1!=0)
  {
    rem=n1%10;
    res=res+pow(rem,count);
    n1=n1/10;
  }
  if(res==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}