#define SUB(X,Y) (X)*Y
int main()
{
	int a=3,b=4;
	printf("%d\n",SUB(a++,b++));
	return 0;
} 
