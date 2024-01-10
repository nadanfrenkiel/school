import java.util.*;
import java.util.Arrays;

public class pg62tar35 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = new int[16];
		int max = 0, md = 0, tickets, show;
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
		System.out.println("enter show num");
		show = reader.nextInt();
		while (show != 0)
		{
			System.out.println("enter ticket amount");
			tickets = reader.nextInt();
			a[show] += tickets;
			System.out.println("enter show num");
			show = reader.nextInt();
		}
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max) {
				max = a[i];
		}
			System.out.println("show number " + i + "had " + a[i] + "tickets bought");
		}
		
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] == max) {
				System.out.print("show number" + md + "is the (one of the) fav shows with " + max + "tickets bought");
		}
			System.out.println("show number " + i + "had " + a[i] + "tickets bought");
		}
	}
}