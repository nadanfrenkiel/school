import java.util.*;
import java.util.Arrays;
public class PG21Ex6
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		String str;
		boolean strong = false;
		System.out.println("enter password");
		str = reader.next();
		for (int i = 0; i < str.length(); i++) {
			if (str.length()>=6) {
				for (int j = 0; j < 10; j++) {
					if (str.charAt(i) == j) {
						strong = true;
						System.out.println(" password strong enough");
						i = str.length()-1;
					}
				}
			}
			else {
				System.out.println("not strong enough, enter more chars");
				str += reader.next();
			}
			System.out.print(strong);

		}
	}
}