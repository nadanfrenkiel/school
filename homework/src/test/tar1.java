
package test;

import java.util.*;
import java.util.Arrays;
public class tar1
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		System.out.println ("enter array length");
		int l = reader.nextInt ();
		System.out.println ("enter array");
		char [] a = new char [l];
		char [] b = new char [l];
		int n =0, n2 = 0, n2c = 0, nc = 0, hold;
		for (int i = 0; i < a.length; i++) {
			a[i] = reader.next().charAt(0);		}
		for (int i = 0; i < a.length; i++) {
			b [i] = a [i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print (b [i] + ",");
		}
	}
}
