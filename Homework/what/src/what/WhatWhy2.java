package what;

import java.io.FileInputStream;
import java.util.*;

public class WhatWhy2 {			

	public static void main(String[] args) {
		try (FileInputStream input = new FileInputStream("input.txt"); Scanner reader = new Scanner(input)) {
			
//			Scanner reader = new Scanner(input);		
			int Twonum, temp, temp2, temp3;
			System.out.println("Enter num in using block");
			Twonum = reader.nextInt();
			
//			limit=reader.nextInt();

			temp2 = Twonum / 10;
			temp = Twonum % 10;
			temp3 = temp % 2;
			// four=nadan.nextDouble();
			if (temp3 != 0) {
				if (temp2 == 1) {
					System.out.println("0" + (temp - 1));
				} else {
					System.out.println(Twonum - 11);
				}
			} else {
				if (temp2 == 9) {
					System.out.println("0" + (temp + 1));
				} else {
					System.out.println(Twonum + 11);
				}
			}
		}
		     catch(Exception e) {
		         e.getStackTrace();
		      }
	}
}