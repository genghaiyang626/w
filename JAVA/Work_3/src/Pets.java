import java.io.StringReader;

public class Pets {
	private String name;
	private int age;
	private double weight;
	private static int counter=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public Pets()
	{
		this.name="����";
		this.age=0;
		this.weight=0.0;
		this.counter+=1;
	}
	
	public Pets(String x,int y,double z)
	{
		this.name=x;
		this.age=y;
		this.weight=z;
		this.counter+=1;
	}
	
	public void Eat(Double kll)
	{
		double add=kll/50;
		this.weight+=add;
		System.out.println(this.name+"�Ե�ʳ����"+kll+"��·��,����������"+add+"��");
	}
	
	public void Run(Double s)
	{
		double dele = s/1000*10;
		this.weight-=dele;
		System.out.println(this.name+"�ܵľ�����"+s+"��,���ؼ�����"+dele+"��");
	}
	
	public static void Sum()
	{
		System.out.println("������������"+counter+"ֻ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}