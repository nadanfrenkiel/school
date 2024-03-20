import java.util.*;
import java.util.Arrays;
public class PG21Ex2
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		String str;
		for (int i = 0; i < 40; i++) {
			str = reader.next();
			if (str.length()%2 == 0) {
				System.out.println(str);
			}
		}
	}
}