package Default;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������");
		Scanner in = new Scanner(System.in);
		System.out.print("����a��");
		int a=in.nextInt();
		System.out.print("����b��");
		int b=in.nextInt();
		//�����������ĳ˻������������������Լ������С�������Ļ���
		int ans2 = a*b/fun(a,b);
		System.out.println("��С���������ڣ�"+ans2);
	}
	
	public static int fun(int a,int b) 
	{
		int ans = a%b;
		if(ans==0)
		{
			System.out.println("���Լ�����ڣ�"+b);
			return b;
		}
		return fun(b,ans);
	}

}
