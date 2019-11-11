#include<stdio.h>

int sum(int x)
{
	if(x==0) return 0;
	int ans=x%10;
	return ans+sum(x/10); 
} 

int main()
{	
	int x;
	scanf("%d",&x);
	printf("%d\n",sum(x));
	return 0;
}
