import java.util.Scanner;
import unit4.bucketLib.Bucket;
public class NewBuckProg3 	 {
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args) {
		System.out.println("enter number n");
		int n = reader.nextInt();
		NewBuck [] arr = new NewBuck [n];
		for (int i = 1; i < n; i++) {
			arr [i] = new NewBuck ((int)(Math.random()*(10+1)), String.valueOf(i+1));
			arr[i].fill((double)(Math.random()*(arr[i].getCapacity()+1)));
			System.out.println(arr[i].toString());
		}
	}
}
