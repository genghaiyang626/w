#include "stdio.h"

int fun(int n)
{
	int i,ans=1;
	for(i=1;i<=n;i++)
	{
		ans*=i;
	}
	return ans;
}

double func(double X,int N)
{
    double s = 1;        //�����ܵļ���ֵ
    double tmp = 1.0;    //����x��n�η�
    int i;
    for(i=1;i<=N;i++){
        tmp *= X;           //tmp = tmp*x;
        double jc=fun(i);
        s+=tmp/jc;        //s = s+tmp/i;  ������ǿ��ת��Ϊ������
    }

    return s;
}

int main()
{
int n=0;
double x=0;
scanf("%lf",&x);
scanf("%d",&n);
printf("%lf\n",func(x,n));
return 0;
} 
