#include<stdio.h>
int fun1(int n,int ans)
{
	
	
	ans+=n%10;
	n/=10;
	
	if(n==0) return ans;
	
	return fun1(n,ans*10); 
}

bool fun2(int x)
{
	//int i;
	for(int i=2;i<=x/2;i++)
	{
		if(x%i==0)
		{
			 return false;
		}	
	}
	return true;
}

int main()
{
	int n;
	scanf("%d",&n);
	n=fun1(n,0);
	printf("%d\n",n);
	if(fun2(n))
	{
		printf("yes\n");
	}
	else
	{
		printf("no\n");
	}
	return 0;
}
