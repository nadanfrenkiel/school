package test1;

import java.util.*;
public class pg168e14
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		int n2 = 0;
		for (int i=1; i<= 1000; i++) {
			
			for (int j = 1; j >= i/2; j++) {
				if (i%j == 0) {
					n2 = n2 + j;
				}
			}
			n2 = 0;
			if (n2 == i) {
				System.out.println(n2);
			}

			}



	}
}