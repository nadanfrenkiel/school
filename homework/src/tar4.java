import java.util.*;
import java.util.Arrays;
public class tar4
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{

		System.out.println ("enter array");
		double [] a = new double [10];
		double [] b = new double [10];

		int n =0, n2 = 0, n2c = 0, nc = 0, hold;
		for (int i = 0; i < a.length; i++) {
			a[i] = reader.nextDouble ();
		}
		for (int i = 9; i >= 0; i++) {
			System.out.print (a[i] + ",");
		}
	}
}
