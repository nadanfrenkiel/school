import java.util.Scanner;
import unit4.bucketLib.Bucket;
public class TextNewBuck {
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args) {
		Bucket temp = new Bucket (20, "one");
		Bucket temp2 = new Bucket (20, "one");
		temp.pourInto(temp2);
	}
}
