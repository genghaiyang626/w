#include<stdio.h>
int fun1(int n,int ans)
{
	
	
	ans+=n%10;
	n/=10;
	
	if(n==0) return ans;
	
	return fun1(n,ans*10); 
}

int fun2(int x)
{
	int i;
	for(i=2;i<=x/2;i++)
	{
		if(x%i==0)
		{
			 return 0;
		}	
	}
	return 1;
}

int fun3(int n) 
{
	if(fun2(n))
	{
		return 1;
		//printf("yes\n");
	}
	else
	{
		return 0;
		//printf("no\n");
	}
}

int main()
{
	int n;
	scanf("%d",&n);
	//判断输入数字是否为素数 
	 if(fun3(n))
	 {
	 	//将逆序整数 
		n=fun1(n,0);
		//判断逆序整数是否为素数 
    	if(fun3(n))
    	{
    		printf("yes\n");
    	}
    	else
    	{
    		printf("no\n");
    	}
	 }
	 else
	 {
	 	printf("no\n");
	 }
	 


}
