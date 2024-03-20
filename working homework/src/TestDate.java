import java.util.Scanner;
public class TestDate
{
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args)
	{
		int temp;
		Date date1 = new Date (2,11,2007);
		Date date2 = new Date (2,3,2007);
		temp = date1.getDay();
		date1.setDay(date2.getDay());
		date2.setDay(temp);
		temp = date1.getMonth();
		date1.setMonth(date2.getMonth());
		date2.setMonth(temp);
		temp = date1.getYear();
		date1.setYear(date2.getYear());
		date2.setYear(temp);
		date1.toString();
		date2.toString();		
	}
}

