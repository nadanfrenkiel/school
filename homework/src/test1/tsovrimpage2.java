package test1;
import java.util.*;
import java.util.Arrays;
public class tsovrimpage2
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{

		int [] a = new int [8];	
		int max = 0, md = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
		 
		for (int i = 0; i < 10; i++) {
			System.out.println ("enter your top 3 stations");
			int one = reader.nextInt();
			int two = reader.nextInt();
			int three = reader.nextInt();
			a[one] += 3;
			a[two] += 2;
			a[three] += 1;

		}
		for (int i = 0; i < a.length ; i++) {
			System.out.println("station number " + i+1 + "had " + a[i] + "points");
		}
	}
}