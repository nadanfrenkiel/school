
package test;

import java.util.*;
import java.util.Arrays;
public class pg47tar21
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		System.out.println ("enter array length");
		int l = reader.nextInt ();
		System.out.println ("enter array");
		int [] a = new int [l];
		int [] b = new int [l/3];

		int n =0, n2 = 0, n2c = 0, nc = 0, hold;
		for (int i = 0; i < a.length; i++) {
			a[i] = reader.nextInt ();
		}
		for (int i : b) {
			if (a [i*3] == 1 ) {
				b [i] = a [i*3 +1] + a [i*3 +2];
			}
			if (a [i*3] == 2 ) {
				b [i] = a [i*3 +1] - a [i*3 +2];
			}
			}

		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a [i] + ",");
		}
		System.out.println ();
		for (int i = 0; i < b.length; i++) {
			System.out.println (b [i] + ",");
		}
		

	}
}
