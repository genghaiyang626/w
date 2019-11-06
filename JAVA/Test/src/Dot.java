
public class Dot {
	public double X,Y;
	public Dot(double x,double y) 
	{
		X=x;
		Y=y;
	}
	public double distance(Dot s)
	{
		return Math.sqrt((X-s.X)*(X-s.X)+(Y-s.Y)*(Y-s.Y));
	}
}
