import java.util.Scanner;
public class TestMovie
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[] args){
		Movie [] arr= new Movie [3]; //I did 3 because entering 7 movies was too slow
		Movie [] temp = new Movie [arr.length];
		Movie [] temp2 = new Movie [arr.length];
		int prizes = 0, min, tc = 0, tc2 = 0;
		for (int i = 0;  i < arr.length; i++) {
			System.out.println ("Enter movie parameters (Name,language, length in minutes and amount of prizes won) for movie number" + (i+1));
			arr[i] = new Movie ();			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + arr[i].getLanguage() + arr[i].getMin() + arr[i].getPrizes());
			prizes += arr[i].getPrizes();
		}

		System.out.println("are the first 2 movies the same length?" + arr[0].isTheSameLength(arr[1]));
		System.out.println("how many english movies are there?" + arr[0].howMany(arr, arr[0]));
		System.out.println("how many english movies are there?" + howMany(arr, arr[0]));
		System.out.println ("the amount of total prizes is: " + prizes);
		min = arr[0].getMin();
    	for (int i = 1; i < arr.length; i++) { 
    		if (arr[i].getMin() < min) {
    			min = arr[i].getMin();
    		}
    	}
    	
    	for (int i = 0; i < arr.length; i++) { 
    		if (arr[i].getName() != "english" || arr[i].getName() != "English" ) {
    			temp[tc] = arr [i];
    			tc++;
    		}
    		else {
    			temp2 [tc2]  = arr[i];
    		}
    	}
    	System.arraycopy(temp2, 0, arr, 0, tc2);
    	System.arraycopy(temp, 0, arr, tc2+1, tc);
	}
}