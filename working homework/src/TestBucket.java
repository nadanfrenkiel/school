import java.util.Scanner;
public class TestBucket {
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args) {
		Bucketer b1 = new Bucketer (5);
		Bucketer b2 = new Bucketer (8);
		b1.fill(7);
		b2.fill(1);
		b2.empty();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		b1.pourInto(b2);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		}
}

