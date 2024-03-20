import java.util.Scanner;
public class TestRational
{
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args)
	{
		Rational rat1 = new Rational (1,2);
		Rational rat2 = new Rational (2,4);
		System.out.println(rat1.toString());
		System.out.println(rat2.toString());
		System.out.println(rat1.multiply(rat2).toString());
		System.out.println(rat1.divide(rat2).toString());
		System.out.println(rat1.equals(rat2));
		
	}
}

