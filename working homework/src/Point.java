import java.util.*;
public class Point
{
	  public static Scanner reader=new Scanner(System.in);
		private double x;
		private double y;        
       
        
     /*  פעולות בונות**/    
    //ט.כניסה: הפעולה מקבלת שם שיר, שם מבצע ואורך השיר בשניות    
    //ט.יציאה: הפעולה בונה ומחזירה עצם שיר עפ"י הערככים שהתקבלו    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //ט.יציאה: הפעולה בונה ומחזירה עצם שיר עפ"י הערככים שנקלטו    
    public Point()
{
	  this.x = reader.nextDouble();
        this.y = reader.nextDouble ();;

}
	
    /* פעולות מאחזרות**/  
    public double getX()
    {
        return this.x;
    }
   
    
    public double getY()
    {
        return this.y;
    }

   
    /*  פעולות קובעות**/ 
    public void setX(double x)
    {
        this.x = x;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }


    public double distance (Point p) {
    	
    	return Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y,2));
    }

    public Point middle (Point p) {
		Point p1 = new Point ((this.x = p.x)/2, (this.x = p.x)/2);
    	return p1;
    }
   
       public String toString()
       {
                return "(" + this.x +", " + this.y + ")";  
       }        
    
}

