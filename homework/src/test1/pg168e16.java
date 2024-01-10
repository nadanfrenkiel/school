package test1;

import java.util.*;
public class pg168e16
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		int n = 0, w = 0;
		for (int i = 1; i<=4; i++) {
			for (int k = 4; k>=i; k--) {
				System.out.print ("$");
				n++;
			}
			System.out.println();
		}
	}
}