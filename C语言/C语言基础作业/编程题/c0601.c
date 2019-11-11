#include<stdio.h>
void del(char s[],int n)
{
	int i;
	for(i=n;s[i+1]!='\0';i++)
	{
		s[i]=s[i+1];
	}
	s[i]='\0';
}

int main()
{
	char a[200];
	scanf("%s",a);
	int i,j;
	for(i=0;a[i]!='\0';i++)
	{
		for(j=i;a[j+1]!='\0';j++)
		{
			if(a[i]==a[j+1])
			{
				del(a,j+1);
				j--;
			}
		}
	}
	printf("%s\n",a);
	return 0;
}
