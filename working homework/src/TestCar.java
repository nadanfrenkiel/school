import java.util.Scanner;
public class TestCar
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[] args){
		int electrics = 0, maxSeats = 0;
		Car [] carsArray= new Car [3]; //I did 3 because entering 7 movies was too slow

		for (int i = 0;  i < carsArray.length; i++) {
			System.out.println ("Enter car details" + (i+1));
			carsArray[i] = new Car ();			
		}
		for (int i = 0;  i < carsArray.length; i++) {
			if (carsArray[i].getisElectric() == true) {
				electrics ++;
			}
		}
		System.out.println(electrics + "the amount of electric cars are");
		
		for (int i = 0;  i < carsArray.length; i++) {
			Car c = carsArray[i];
			if (c.getSeats() > maxSeats) {
				maxSeats = c.getSeats();
			}
		}
		for (int i = 0;  i < carsArray.length; i++) {
			Car c = carsArray[i];
			if (c.getSeats() == maxSeats) {
				System.out.println (c.getPrice());
			}
		}

	}
}