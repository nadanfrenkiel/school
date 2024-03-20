
	import java.util.*;
	import java.util.Arrays;
	public class PG69Ex44 {
		static Scanner reader=new Scanner (System.in);
		public static void main (String[]args)
		{
			System.out.println("Enter Amount of flowers");
			int nput = reader.nextInt();
			int [] input = new int[nput];
			System.out.println("Enter codes");
			for (int i = 0; i < input.length; i++) {
				input[i] = reader.nextInt();
			}
			seperate (input);
		}
		
		public static void seperate (int [] original) {
			int [] groupOne = new int[original.length];
			int [] groupTwo = new int[original.length];
			int count = 0;
			
			for (int i = 0; i < original.length; i++) {
				if (original[i]/100 == 1) {
					groupOne[count] = original[i];
					count++;
				}
				else {
					groupTwo[i-count] = original[i];
				}
			}
			printArray (groupOne, count);
			System.out.println();
			printArray (groupTwo, original.length-count);
		}
		
		public static void printArray (int [] array, int amount) {
			for (int i = 0; i < amount-1; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.print(array[amount-1]);
		}
}
