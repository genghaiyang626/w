
public class TestPets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pets p1=new Pets();
		Pets p2=new Pets("����",2,30.6);
		p1.Eat(600.0);
		p1.Run(3000.0);
		p2.Eat(500.0);
		p2.Run(5000.0);
		Pets p3=new Pets();
		Pets p4=new Pets();
		Pets p6=new Pets();

//		p6.Sum();
		Pets.Sum();
	}

}
