import java.util.Scanner;
public class TestPoint
{
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args)
	{
		double temp;
		Point p1 = new Point (43, 7);
		Point p2 = new Point (5, 5);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p2.distance(p1));
		temp = p1.getX();
		p1.setX(p2.getX());
		p2.setX(temp);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p2.middle(p1));
		}
}

