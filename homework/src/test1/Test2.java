
package test1;

import java.util.*;
public class Test2
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		System.out.println("enter length of array");
		int l = reader.nextInt ();
		System.out.println("enter num");
		int num = reader.nextInt();
		int [] a = new int [l];
		int n =0, n2 = 0, n2c = 0, nc = 0, hold;
		boolean w = true;
		for (int i = 0; i < a.length; i++) {
			a[i] = reader.nextInt ();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; i < a.length; i++) {
				n = num - a [i];
				if (num - a [i] == a [j]) {
					System.out.println("(" + a[i] + ","+ a[j] + ")");
				}
			}
		}
		System.out.println ("these were the schum(s)");

		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; i < a.length; i++) {
				n = num - a [i];
				if (a [i]* a [j] == num) {
					System.out.println("(" + a[i] + ","+ a[j] + ")");
				}
			}
		}
		System.out.println ("these were the machpelas");
		



	}
}