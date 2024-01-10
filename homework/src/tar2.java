import java.util.*;
import java.util.Arrays;
public class tar2
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		System.out.println ("enter array length");
		int l = reader.nextInt ();
		System.out.println ("enter array");
		int [] a = new int [l];
		int [] b = new int [l];

		int n =0, n2 = 0, n2c = 0, nc = 0, hold;
		for (int i = 0; i < a.length; i++) {
			a[i] = reader.nextInt ();
		}
		for (int i = 0; i < a.length; i++) {
			if (a [i] < 0) {
				b [n] = a [i];
				n ++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a [i] >= 0) {
				b [n] = a [i];
				n ++;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print (b [i] + ",");
		}
	}
}
