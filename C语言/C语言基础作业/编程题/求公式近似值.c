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
    double s = 1;        //保存总的计算值
    double tmp = 1.0;    //保存x的n次方
    int i;
    for(i=1;i<=N;i++){
        tmp *= X;           //tmp = tmp*x;
        double jc=fun(i);
        s+=tmp/jc;        //s = s+tmp/i;  计算结果强制转换为浮点型
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
