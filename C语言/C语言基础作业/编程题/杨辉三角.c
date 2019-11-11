#include<stdio.h>
#define N 11

yahui(int a[][N])
{
	int i,j;
	for(i=1;i<N;i++)
	{
		a[i][1]=1;
		a[i][i]=1;
	}
	for(i=3;i<N;i++)
	{
		for(j=2;j<i;j++)
		{
			a[i][j]= a[i-1][j-1] +a[i-1][j];
		}
	}
}


int main()
{	
	//int a[2][3]={{1,2},{3,4},{5,6}};
	//static int a[][4]={{0},{0},{0}};
	int i,j;
	int s[11][11];
	
	for(i=0;i<N;i++)
	{
		for(j=0;j<N;j++)
		{
			s[i][j]=0;
		}
	}
	yahui(s);
	for(i=0;i<N;i++)
	{
		for(j=0;j<N;j++)
		{
			printf("%d ",s[i][j]);
		}
		printf("\n");
	}
	return 0;
}
