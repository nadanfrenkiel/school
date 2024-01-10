package test1;

import java.util.*;
public class pg168e15
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		int n, w = 0, l = 0;
		n = reader.nextInt();
		for (int k = 1; k<=10; k++) {
		for (int i = 1; i<6; i++) {
			n = reader.nextInt();
			w += n;
			if (n<60) {
				l++;
			}
		}

		System.out.println(w/6);
	}
		System.out.print(l);
		
	}
}