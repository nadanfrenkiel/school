import java.util.Scanner;
import unit4.bucketLib.Bucket;
public class NewBuckProg1 {
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args) {
		Bucket [] arr = new Bucket [6];
		arr [0] = new Bucket (64, "1");
		arr[0].fill(64);
		System.out.println(arr[0].toString());
		for (int i = 1; i < 6; i++) {
			arr [i] = new Bucket (arr[0].getCapacity(), String.valueOf(i+1));
			arr[i].fill(arr[0].getCurrentAmount()/(Math.pow(2, i)));
			System.out.println(arr[i].toString());
		}
		System.out.print("heyo");
	}
}
