
public class TestRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(2.5,2.5,"gold");
		double temp=r1.getArea();
		System.out.println("矩形的面积为："+temp);
		r1.setWidth(3.5);
		r1.setHeight(3.5);
		System.out.println("矩形的面积为："+r1.getArea());
	}

}
