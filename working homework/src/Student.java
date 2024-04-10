import java.util.Scanner;

public class Student
{
	  public static Scanner reader=new Scanner(System.in);
	  private String name;    // שם התלמיד         
      private String idNum;    // מספר ת"ז         
      private int math;    // ציון במתמטיקה         
	  private int english;      // ציון באנגלית
      private int language;    // ציון בלשון         
        //ט.כניסה: הפעולה מקבלת שם תלמיד, מספר ת"ז, ציון במתמטיקה, ציו באנגלית וציון בלשון  
        //ט.יציאה: הפעולה בונה ומחזירה עצם תלמיד עפ"י הערכים שהתקבלו    
        public Student(String name, String idNum, int math, int english, int language)
        {
        	this.name=name;
        	this.idNum=idNum;
        	this.math=math;
        	this.english=english;
        	this.language=language;
        }
        //ט.יציאה: הפעולה בונה ומחזירה עצם תלמיד עפ"י הערככים שנקלטו    
        public Student()
        {
        	System.out.println("הזן את שם התלמיד");
        	this.name=reader.nextLine();
        	System.out.println("הזן מספר תעודת זהות");
        	this.idNum=reader.nextLine();
        	System.out.println("הזן ציונים במתמטיקה, באנגלית ובלשון בהתאמה");
        	this.math=reader.nextInt();
        	this.english=reader.nextInt();
        	this.language=reader.nextInt();
        }
        // ט.יציאה: הפעולה מאחזרת את שם התלמיד
        public String getName()
        {
            return this.name;
        }
        // ט.יציאה: הפעולה מאחזרת את המספר תעודת זהות
        public String getIdNum()
        {
            return this.idNum;
        }
        // ט.יציאה: הפעולה מאחזרת את הציון במתמטיקה
        public int getMath()
        {
            return this.math;
        }
        // ט.יציאה: הפעולה מאחזרת את הציון באנגלית
        public int getEnglish()
        {
            return this.english;
        }
        // ט.יציאה: הפעולה מאחזרת את הציון בלשון
        public int getLanguage()
        {
            return this.language;
        }
        //ט.כניסה: הפעולה מקבלת שם תלמיד
        //ט.יציאה: הפעולה קובעת את שם התלמיד הנוכחי להיות שם התלמיד שהתקבל
        public void setName(String name)
        {
            this.name = name;
        }    
        //ט.כניסה: הפעולה מקבלת מספר תעודת זהות
        //ט.יציאה: הפעולה קובעת את מספר תעודת הזהות הנוכחי להיות מספר תעודת הזהות שהתקבל
        public void setIdNum(String idNum)
        {
            this.idNum = idNum;
        }   
        //ט.כניסה: הפעולה מקבלת ציון במתמטיקה
        //ט.יציאה: הפעולה קובעת את הציון במתמטיקה הנוכחי להיות הציון במתמטיקה שהתקבל
        public void setMath(int math)
        {
            this.math = math;
        }   
        //ט.כניסה: הפעולה מקבלת ציון באנגלית
        //ט.יציאה: הפעולה קובעת את הציון באנגלית הנוכחי להיות הציון באנגלית שהתקבל
        public void setEnglish(int english)
        {
            this.english = english;
        }   
        //ט.כניסה: הפעולה מקבלת ציון בלשון
        //ט.יציאה: הפעולה קובעת את הציון בלשון הנוכחי להיות הציון בלשון שהתקבל
        public void setLanguage(int language)
        {
            this.language = language;
        }
        //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את תכונות התלמיד 
        public String toString()
        {
            return "Student Details: "+" name: "+this.name+" id number:  "+this.idNum+" Math Grade:  "+this.math+" English Grade:  "+this.math+" Language Grade:  "+this.language;  
        }
        //ט.כניסה: הפעולה מקבלת שם מקצוע ואחוז
        //ט.יציאה: הפעולה מעלה את הציון במקצוע שהתקבל באחוז שהתקבל
        public void giveBonus(String subject, double percent)
        {
        	double thiSubject;
        	if (subject=="english") {
        		thiSubject=(double)(this.english);
        		thiSubject=this.english+percent*(thiSubject/100);
        		this.english=(int)(thiSubject);
        	}
        	if (subject=="math") {
        		thiSubject=(double)(this.math);
        		thiSubject=this.math+percent*(thiSubject/100);
        		this.math=(int)(thiSubject);
        	}
        	if (subject=="language") {
        		thiSubject=(double)(this.language);
        		thiSubject=this.language+percent*(thiSubject/100);
        		this.language=(int)(thiSubject);
        	}
        }   
        //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את ממוצע הציונים של התלמיד
        public String comment()
        {
        	double avg=(this.language+this.math+this.english)/3;
        	if (avg>90) {
        		return "מצטיין";
        	}
        	if ((avg<=89)&&(avg>=75)) {
        		return "טוב";
        	}
        	if ((avg<=74)&&(avg>=55)) {
        		return "עובר";
        	}else {
        		return "נכשל";
        	}
        }
}