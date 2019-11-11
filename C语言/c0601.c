#include<stdio.h>
void killsame(char *o, char *n)
{
	int i=0, j, k=0;
	int label;

	while(o[i] != '\0')
	{
		label = 1;
		for(j=0; j<i; j++)
		{
			if (o[i] == n[j])
				label = 0;
		}
	if(label)
		n[k++]=o[i];
	i++;
	}
	n[k]='\0';
	puts(n);
}

int main(void)
{
	printf("Please input a string you want:\n");
	char old[126];
	char new[126];
	scanf("%s",old);
	killsame(old, new);

	return 0;
}


