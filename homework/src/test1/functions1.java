import java.util.*;
import java.util.Arrays;
public class functions1
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		System.out.println ("amount of inputs");
		int n = reader.nextInt();
		int [] notodd = new int [n];
		int [] minus = new int [n];
		indexs (n, notodd, minus);
		print (notodd);
		print (minus);
	}

	public static void print (int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void indexs (int num, int [] evens, int [] negs) {
		int zugi = 0, neg = 0, temp;
		System.out.println ("amount of inputs");
		for (int i = 0; i < num; i++) {
			System.out.println ("enter input number" + i+1);
			temp = reader.nextInt();
			if (temp%2 == 0) {
				evens [zugi] = temp;
				zugi++;
			}
			if (temp < 0) {
				negs [neg] = temp;
				neg++;
			}
		}
		
	}
}