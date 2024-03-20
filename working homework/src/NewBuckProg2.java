import java.util.Scanner;
import unit4.bucketLib.Bucket;
public class NewBuckProg2 {
	public static Scanner reader=new Scanner (System.in);	
	public static void main (String[] args) {
		System.out.println("enter number n");
		int n = reader.nextInt();
		double max;
		NewBuck [] arr = new NewBuck [n];
		for (int i = 0; i < n; i++) {
			arr [i] = new NewBuck (20, String.valueOf(i+1));
			arr[i].fill(0+(double)(Math.random()*(20+1)));
			System.out.println(arr[i].toString());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("now filled :DD");
		System.out.println();
		System.out.println();
		System.out.println();

		max = findMax(arr);
		arr = setAmount (arr, max);
		print(arr);
	}
	
	public static double findMax (NewBuck [] arr) {
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getCurrentAmount() > max) {
				max = arr[i].getCurrentAmount();
			}
		}
		return max;
	}
	
	public static NewBuck [] setAmount (NewBuck [] arr, double max) {
		NewBuck [] arr2 = new NewBuck [arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = new NewBuck (20, String.valueOf(i+1));
			arr2[i].fill(max);;
		}
		return arr2;
	}
	
	public static void print (NewBuck [] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}
