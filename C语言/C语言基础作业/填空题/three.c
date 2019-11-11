#include<stdio.h>
#include<string.h>
//void str(char s[],int i,int j)
//{
//	char temp;
//	if(i<j)
//	{
//		temp=s[i];
//		s[i]=s[j];
//		s[j]=temp;
//		str(s,++i,--j);
//	}
//}/
/*int func(int n)
{
	if(n<=1)
	{
		return 1;
	}
	else
	{
		return (2+n*func(n-1));
	}
}*/
void main()
{
	int x=4;
	printf("%d\n",func(x));
	//char string[]="helloworld";
	//str(string,0,strlen(string)-1);
	//printf("%s",string);
}
