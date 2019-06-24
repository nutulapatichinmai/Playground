#include <stdio.h>
int main() {
	//Type your code
  int n,n1,firstdigit,sum=0;
  scanf("%d",&n);
  n1=n%10;
  firstdigit=n;
  while(n>=10)
  {
    n=n/10;
  }
  firstdigit=n;
  sum=n1+firstdigit;
  printf("%d",sum);
}