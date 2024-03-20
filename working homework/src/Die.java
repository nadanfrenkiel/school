/**
 * this is a javadoc apparently
 * I am pretty sure that this is what I'm supposed to do and at some point I'll get an HTML doc??
 * I can @author nadan people (just me at the moment :/ )
 */

import java.util.Scanner;
public class Die
{
	  public static Scanner reader=new Scanner(System.in);
		private int currentNum;

        
       
        
     /*  פעולות בונות**/    
   
    public Die()
    {

    }

    
	
    /* פעולות מאחזרות**/  
    public int getNum()
    {
        return this.currentNum;
    }
   
    

   
    /*  פעולות קובעות**/ 
    public void roll()
    {
        this.currentNum = 1+(int)(Math.random()*(6));
    }
    



   
       public String toString()
       {
                return "nothing to string"  
       }        
    
}

