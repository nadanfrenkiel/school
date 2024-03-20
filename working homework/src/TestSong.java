import java.util.*;
public class TestSong
{
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args)
	{
		int length;
		Song shir=new Song ("סילסולים", "סטטיק ובן אל", 200);
		System.out.println(shir.getName()+"שם השיר");
		shir.setName("זהב");
		shir.decreaseLength(10);
		System.out.println (shir.toString()+"פרטי השיר");			
		System.out.println(shir.category()+"הקטגוריה היא");	
		String singer = reader.next();
		String song = reader.next();
		length = reader.nextInt ();
		Song shir2 = new Song (song, singer, length);
		System.out.println(shir2.category());
		shir2.increaseLength(40);
		System.out.println (shir2.toString()+"פרטי השיר");			
		System.out.println(shir2.category());
		song = reader.nextLine();
		shir2.setName(song);
		System.out.print(shir2.getName());
		}
}

