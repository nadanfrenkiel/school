package test1;
import java.util.*;
import java.util.Arrays;
public class monim1
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{

		int [] a = new int [7];	
		
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
		
		while () {
			System.out.println ("enter fav day 1-7");
			int d = reader.nextInt;
			a[d-1]++;
		}
		int max = a[0];
		for (int i = 2; i < a.length; i++) {
			if (max < a [i]) {
				max = a [i];
			}
		}
		System.out.print("day number" + max + "is the fav day");
	}
}