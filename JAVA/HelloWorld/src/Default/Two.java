package Default;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入两个数：");
		Scanner in = new Scanner(System.in);
		System.out.print("输入a：");
		int a=in.nextInt();
		System.out.print("输入b：");
		int b=in.nextInt();
		//由于两个数的乘积等于这两个数的最大公约数与最小公倍数的积。
		int ans2 = a*b/fun(a,b);
		System.out.println("最小公倍数等于："+ans2);
	}
	
	public static int fun(int a,int b) 
	{
		int ans = a%b;
		if(ans==0)
		{
			System.out.println("最大公约数等于："+b);
			return b;
		}
		return fun(b,ans);
	}

}
