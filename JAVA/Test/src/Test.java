
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One s=new One();
		s.set(666);
		System.out.println(s.get());
		Dot d1=new Dot(-20,20);
		Dot d2=new Dot(20,-10);
		System.out.println(d1.distance(d2));
		
	}

}
