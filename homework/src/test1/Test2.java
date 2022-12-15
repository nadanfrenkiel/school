
package test1;

import java.util.*;
public class Test2
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{
		int license, speed, limit;
		System.out.println("Enter num");
		license=reader.nextInt();
		speed=reader.nextInt();
		limit=reader.nextInt();
		
		//		four=nadan.nextDouble();
		if (speed > limit)	{
			System.out.println("pay:" + (speed-limit)*30+ " ID:" + license);
		}
		else {
			System.out.println("good job");
		}

	}
}