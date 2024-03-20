import java.util.Scanner;

public class Movie
{
	  public static Scanner reader=new Scanner(System.in);
	  private String name;             
      private String language;             
      private int minutes;              
	  private int prizes;      
        public Movie(String name, String language, int minutes, int prizes)
        {
        	this.name=name;
        	this.language=language;
        	this.minutes=minutes;
        	this.prizes=prizes;
        }
        public Movie()
        {
        	System.out.println("הזן את שם הסרט");
        	this.name=reader.nextLine();
        	System.out.println("הזן שפה");
        	this.language=reader.nextLine();
        	System.out.println("הזן אורך בדקות");
        	this.minutes=reader.nextInt();
        	System.out.println("הזן כמות פרסים");
        	this.prizes=reader.nextInt();
        }
        public String getName()
        {
            return this.name;
        }
        public String getLanguage()
        {
            return this.language;
        }
        public int getMin()
        {
            return this.minutes;
        }
        public int getPrizes()
        {
            return this.prizes;
        }
        public void setName(String name)
        {
            this.name = name;
        }    
        public void setLanguage(String language)
        {
            this.language = language;
        }   
        public void setMin(int min)
        {
            this.minutes = min;
        }   
        public void setPrizes(int prizes)
        {
            this.prizes = prizes;
        }   

        public String toString()
        {
        	return "Movie detauls: " + "name: " + this.name + "Language: " + this.language + "Length in minutes: " + this.minutes + "Amount of prizes won: " + this.prizes;
        }
        
        public boolean isTheSameLength(Movie m) {
        	if (this.minutes == m.minutes) {
        		return true;
        	}
        	else {
        		return false;
        	}
        }
        
        public boolean isAppear (Movie [] arr, String name) {
        	boolean is = false;
        	for (int i = 0; i < arr.length; i++) { 
        		if (name == arr[i].getName()) {
        			is = true;
        			return is;
        		}
        	}
        	return is;
        }
        
        public int howMany (Movie [] arr, Movie m) {
        	int amount = 0;
        	for (int i = 0; i < arr.length; i++) { 
        		if (arr[i].isTheSameLength(m)) {
        			amount++;
        		}
        	}
        	return amount;
        }
        
        public boolean sameLanguage (Movie [] arr) {
        	boolean hasSame = false;
        	for (int i = 0; i < arr.length; i++) { 
            	for (int j = 0; j < arr.length; j++) { 
            		if (arr[i] == arr[j]) {
            			hasSame = true;
            		}
            	}
            	if (hasSame == true) {
            		return true;
            	}
        	}
        	return hasSame;

        }

}