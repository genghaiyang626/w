
public class Rectangle {
	private double width;
	private double height;
	private String color;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		width=0;
		height=0;
		color="û����ɫ";
	}
	public Rectangle(double x,double y,String z) {
		width=x;
		height=y;
		color=z;
	}
	
	public double getArea() {
		double ans=width*height;
		return ans;
	}
}
