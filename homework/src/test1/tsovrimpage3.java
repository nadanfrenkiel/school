package test1;
import java.util.*;
public class tsovrimpage3
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{

		int [] a = new int [7];
		int [] q = new int [7];
		for (int i = 0; i < a.length; i++) {
			System.out.println ("enter amount of available seats in theaeter number " + i+1);
			a[i] = reader.nextInt();
		}
		for (int i = 0; i < q.length; i++) {
			q[i] = 0;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println ("enter your wanted theater and amount of tickets");
			int movie = reader.nextInt();
			int tickets = reader.nextInt();
			if ((q[movie]+tickets) > a[movie]) {
				System.out.println ("not enough space for yall :/");
			}
			else {
				q[movie] += tickets;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("movie number " + i+1 + "had " + a[i] + "tickets bought, and had" + (a[i]-q[i]) + "seats left");
		}
	}
}