package test1;

import java.util.*;
public class testq3
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		int [] n = new int [30];
		int scounter = 0, upc = 0;
		boolean streak = false;
		for (int i = 0; i < n.length; i++) {
			n[i] = reader.nextInt ();
		}
		
		for (int i = 0; i < n.length-1; i++) {
			if (n [i] + n [i+1]>= 600) {
				if (streak = false) {
					System.out.println("קיימים יומיים ברצף בימים:");
				}
				scounter++;
				streak = true;
				System.out.print(i+1 + "," + i+2 + "	");
			}

		}
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < n.length-1; i++) {
			if (n[i] < n[i+1]) {
				upc++;
			}
			else {
				System.out.print(upc + ", ");
				upc=0;
			}
		}

	}
}