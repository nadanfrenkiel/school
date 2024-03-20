import java.util.*;
import java.util.Arrays;
public class PG21Ex3
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		String str;
		System.out.println("Enter String to be Checked");
		str = reader.next();

		for (int i = 0; i < str.length(); i++) {
			if (str(i)) {
				System.out.println(str);
			}
		}
	}
}