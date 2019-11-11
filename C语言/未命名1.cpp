#include<stdio.h>
using namespace std; 

int main()
{
	int i,j,A=0,B=0,k=0,m;
	int a[100],b[100];
	while(A<100&&k==0)
	{ 
		scanf("%d",&a[A]);

		if(a[A]==-1){
			k++;
			break;
		} 
		 
		A++;
	}	
	k=0;

	while(B <100&&k==0)
	{
		scanf("%d",&b[B]);
		
		if(b[B]==-1){
			k++;
			break;
		} 
		B++;
	}
	printf("ÄÜµ½Õâ4"); 
	m=0;
	bool flag=true; 
	for(i=0;i<=A-1;i++)
	{
		for(j=0;j<=B-1;j++)
		{
			if (a[i]==b[j])
			{
				flag=false;
			}
			//m++;
		}
		if(flag) m++;
	  //if (m==100)
	}
	printf("%d",m);
	return 0;
}
