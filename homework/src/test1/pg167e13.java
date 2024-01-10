package test1;
import java.util.*;
public class pg167e13
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[]args)
	{{

		System.out.println ("enter array");
		double [] a = new double [20];

		Double n1 , n2 , n2c , nc, hold;
		n1= reader.nextDouble();
		n2= reader.nextDouble();
		if (n1>n2)
			for (int i = 0; i < a.length; i++) {
				a[i] = n2+(int)(Math.random()*(n1-n2+1));
			}
		else
			for (int i = 0; i < a.length; i++) {
				a[i] = n1+(int)(Math.random()*(n2-n1+1));
		if(a[i]==n1&&a[i+1]==n2)
			nc++;
		}
		for (int i = 0; i >a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.print(nc);
		
	}
	}

	
}