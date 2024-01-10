package test1;

import java.util.*;
public class classwork2
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		char [] n = new char [8];
		boolean w= false;
		for (int i = 0; i < n.length; i++) {
			n[i] = reader.next().charAt(0);
		}
		for (char alphabet = 'a'; alphabet <='z'; alphabet ++ ) {
			for (int j = 0; j < n.length; j++) {
				if (n [j] == alphabet) {
					w = true;
				}
		}
		if (w == false) {
			System.out.print(alphabet);
		}
		w = false;
	}
		for (char alphabet = 'A'; alphabet <='Z'; alphabet ++ ) {
			for (int j = 0; j < n.length; j++) {
				if (n [j] == alphabet) {
					w = true;
				}
		}
		if (w == false) {
			System.out.print(alphabet);
		}
		w = false;
	}
}
}