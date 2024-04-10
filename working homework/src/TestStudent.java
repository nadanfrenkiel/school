import java.util.Scanner;
public class TestStudent
{
	static Scanner reader=new Scanner (System.in);
	public static void main (String[] args){
		Student student1=new Student ("Ron", "216139227", 89, 74, 96);
		System.out.println(student1.comment());
		student1.giveBonus("math", 13);
		System.out.println(student1.getMath());
		Student student2=new Student();
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		int avg1=(student1.getMath()+student1.getEnglish()+student1.getLanguage())/3;
		int avg2=(student2.getMath()+student2.getEnglish()+student2.getLanguage())/3;
		if (avg1>avg2) {
			System.out.println("שם התלמיד בעל ממוצע הציונים הגבוה ביותר הוא: " +student1.getName());
		}else {
			System.out.println("שם התלמיד בעל ממוצע הציונים הגבוה ביותר הוא: " +student2.getName());
		}
	}
}