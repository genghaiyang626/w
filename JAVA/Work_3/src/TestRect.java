
public class TestRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(2.5,2.5,"gold");
		double temp=r1.getArea();
		System.out.println("���ε����Ϊ��"+temp);
		r1.setWidth(3.5);
		r1.setHeight(3.5);
		System.out.println("���ε����Ϊ��"+r1.getArea());
	}

}
