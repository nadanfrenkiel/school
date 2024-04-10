import java.util.Scanner;
//מימוש הטיפוס מכונית
public class Car
{
	
	public static Scanner reader= new Scanner(System.in);
	
	private double price; // מחיר המכונית
	private int seats; // מספר מקומות ישיבה 
	private boolean isElectric;// האם הרכב חשמלי?
	private String color;// צבע הרכב
	private char is4x4;// האם רכב שטח או לא 
	
	//פעולות בונות
	//-------------------------------------------------
	/*
	 טענת כניסה: הפעולה מקבלת מחיר, מספר מושבים, האם חשמלי, צבע והאם רכב שטח, 
	 טענת יציאה: הפעולה בונה עצם וקובעת את ערכי התכונות לפי ערכי הפרמטרים שהתקבלו לפעולה
	 */
	public Car (double price, int seats, boolean isElectric,String color,char is4x4)
	{
		this.price=price;  
		this.seats=seats;
		this.isElectric=isElectric;
		this.color=color;
		this.is4x4=is4x4;
	}
	
	 //טענת יציאה: הפעולה בונה עצם וקובעת את ערכי התכונות לפי נתוני הקלט
	 public Car ()
	 {
		System.out.println("הזן את המחיר של הרכב, מספר מקומות ישיבה, האם חשמלי, צבע הרכב והאם רכב שטח או לא: ");
		this.price=reader.nextDouble();  
		this.seats=reader.nextInt();
		this.isElectric=reader.nextBoolean();
		this.color=reader.next();
		this.is4x4=reader.next().charAt(0);
	}
	 
	// פעולות מאחזרות
	//-------------------------------------------------
	//טענת יציאה: הפעולה מחזירה את מחיר המכונית 
	public double getPrice()
	{
		return this.price;
	}
	
	//טענת יציאה: הפעולה מחזירה את מספר המושבים  
	public int getSeats()
	{
		return this.seats;
	}
	
	//טענת יציאה: הפעולה מחזירה האם הרכב חשמלי או לא 
	public boolean getisElectric()
	{
		return this.isElectric;
	}
	
	//טענת יציאה: הפעולה מחזירה את צבע הרכב 
	public String getColor()
	{
		return this.color;
	}
	
	//טענת יציאה: הפעולה מחזירה תו וואי אם הרכב הוא רכב שטח אחרת תחזיר את האות אן 
	public char getIs4x4()
	{
		return this.is4x4;
	}
	
	// פעולות קובעות
	//-------------------------------------------------
	// טענת כניסה הפעולה מקבלת את מחיר המכונית וקובעת אותו מחדש
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	//טענת כניסה: הפעולה מקבלת את מספר המקומות וקובעת את ערכו מחדש 
	public void setSeats(int seats)
	{
	     this.seats=seats;
	}
	
	// טענת כניסה: הפעולה מקבלת ערך בוליאני וקובעת האם הרכב חשמלי או לא
	public void setIsElectrics(boolean isElectric)
	{
		this.isElectric=isElectric;
	}
	
	//טענת כניסה הפעולה מקבלת את הצבע של המכונית וקובעת אותו מחדש 
	public void setColor(String color)
	{
		this.color=color;
	}
	
	// טענת כניסה הפעולה מקבלת תו ולפיו קובעת את ערך התכונה רכב שטח
	public void setiIs4x4(char is4x4)
	{
		this.is4x4=is4x4;
	}
	
	public double cheapest (Car car) {
		double cheap;
		if (car.price > this.price) {
			cheap = this.price;
		}
		else {
			cheap = car.price;
		}
		return cheap;
	}
	
	public void is4by4 (boolean bool, Car [] arr) {
		char temp;
		if (bool == true) {
			temp = 'Y';
		}
		else {
			temp = 'N';
		}
		for (int i = 0;  i < arr.length; i++) {
			if (arr[i].getIs4x4() == temp) {
				arr[i].toString();
			}
		}
	}
	public double averageWhite (Car [] arr) {
		double avg = 0;
		int amount = 0;
		for (int i = 0;  i < arr.length; i++) {
			if (arr[i].getColor() == "white" || arr[i].getColor() == "White") {
				avg += arr[i].price;
				amount ++;
			}
		}
		return (avg/amount);
		
	}
	
	public void aboveAvg (Car [] arr) {
		double avg = averageWhite(arr);
		for (int i = 0;  i < arr.length; i++) {
			Car c = arr[i];
			if (c.getColor() == "white" || c.getColor() == "White") {
				if (c.getPrice() > avg) {
					System.out.println("This car is above average price - ");
					c.toString();
				}
			}
		}
	}
	
	public int isSameColor (String color, Car [] arr) { 
		int amount = 0;
		for (int i = 0;  i < arr.length; i++) {
			Car c = arr[i];
			if (c.getColor() == color) {
				amount ++;
			}
		}
		return amount;
	}
	// טענת כניסה: הפעולה מחזירה מחרוזת המציגה את מצב תכונות הטיפוס	
	public String toString()
	{
		return "The car detials: price: "+this.price+"\n"+"seats number: "+this.seats+"\n"
		+"is it electric? : "+this.isElectric+"\n"+"color : "+this.color+"\n"+"is4x4: "+this.is4x4;
	}
}//class



