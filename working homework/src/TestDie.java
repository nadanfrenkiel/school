import java.util.Scanner;
public class TestDie
{
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args)
	{
		int count = 1;
		Die d61 = new Die ();
		Die d62 = new Die ();
		d61.roll();
		d62.roll();
		System.out.print(d61.getNum() + ", ");
		System.out.println(d62.getNum());
		while (d61.getNum()!=6 || d62.getNum()!=6)
		{
			d61.roll();
			d62.roll();
			System.out.print(d61.getNum()+", ");
			System.out.println(d62.getNum());
			count++;
		}
		System.out.println("you needed" + count + "rolls to get the 6, 6");
	}
}

