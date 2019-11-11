#include<stdio.h>
int fun2(int a,int b)
{
	int c;
	c=a*b%3;
	return c;
}
int fun1(int a,int b)
{
	int c;
	a+=a;
	b+=b;
	c=fun2(a,b);
	return c*c; 
}
int main()
{
	//int x=11,y=19;
	//printf("%d\n",fun1(x,y));
	
	//int a=5,b=6,w=1,x=2,y=3,z=4;
	//(a=w>x)&&(b=y>z);
	//printf("%d\n",b);
	
	char x='A',y='B';
	(x='B')||(y='C');
	printf("%c,%c\n",x,y);
	
	return 0;
}
