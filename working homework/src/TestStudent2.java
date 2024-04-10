import java.util.Scanner;
public class TestStudent2
{
	static Scanner reader=new Scanner (System.in);
	public static double function(Student stu) {
		return (stu.getMath()+stu.getEnglish()+stu.getLanguage())/3;
	}
	public static void main (String[] args){
		Student [] arr= new Student [4];
		for (int i=0; i<arr.length; i++) {
			arr[i]= new Student();
		}
		for (int k=0; k<arr.length; k++) {
			System.out.println("ממוצע הציונים של " +arr[k].getName()+ "הוא: " +function(arr[k]));
		}
		String maxName=arr[0].getName();
		int bigger=0, maxGrade=arr[0].getMath();
		for (int z=1; z<arr.length; z++) {
			if (arr[z].getMath()>maxGrade) {
				maxName=arr[z].getName();
				maxGrade= arr[z].getMath();
			}
		}
		System.out.println("התלמיד בעל הציון הגבוה ביותר הוא " +maxName);
		double avg=0;
		for (int r=0; r<arr.length; r++) {
			avg=avg+arr[r].getEnglish();
		}
		avg=avg/arr.length;
		System.out.println("הציון הממוצע לתלמיד באנגלית הוא " +avg);
		for (int h=0; h<arr.length; h++) {
			if (arr[h].getEnglish()>avg) {
				bigger++;
			}
		}
		System.out.println("כמות התלמידים שקיבלו באנגלית מעל הציון הממוצע הוא " +bigger);
		for (int h=0; h<arr.length; h++) {
			arr[h].giveBonus("Language", 10);
		}
	}
}