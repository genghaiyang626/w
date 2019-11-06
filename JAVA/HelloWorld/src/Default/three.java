package Default;

public class three {

	static int ans[]= new int[9];
	static int num[]= new int[9];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<9;i++)
		{
			ans[i]=0;
			num[i]=0;
		}
		
		fun(0);
	}
	
	public static void fun(int N)
	{
		if(N==9)
		{
			int a=ans[0]*100+ans[1]*10+ans[2];
			int b=ans[3]*100+ans[4]*10+ans[5];
			int c=ans[6]*100+ans[7]*10+ans[8];
			
			if(a+b==c)
			{
				System.out.println(a+" + "+b+" = "+c);
			}
			
			return;
			
		}
			
		for(int i=1;i<=9;i++)
		{
			if(num[i-1]==0)
			{
				num[i-1]=1;
				ans[N]=i;
				fun(N+1);
				ans[N]=0;
				num[i-1]=0;				
			}
			
			
		}
	}

}
