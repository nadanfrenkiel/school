
package what;

import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

	public class Test2 {
		static Scanner reader = new Scanner (System.in);
		public static void main (String[]args) {
	        Dictionary<String, Integer> dict= new Hashtable<>();
			int k,n3,n4 = 0;
			float n = 0;
			ArrayList<LetterCount> arr = new ArrayList<LetterCount>();
			
			Enumeration<Integer> values;
			Enumeration<String> keys;
			boolean done = false;
			String str = "", temp;
			while (done == false) {
				temp = reader.nextLine();
				if (temp != "") {
					str += temp;
				}
				else {
					done = true;
				}
			}

				for (int i = 0; i < str.length(); i++) {
					String ch = String.valueOf(str.charAt(i));
					if (dict.get(ch) == null) {
						dict.put(ch, 0);
					}
					dict.put(ch, dict.get(ch) +1);
					n++;
				}
			values = dict.elements();
			keys = dict.keys();
			System.out.println(values);		
			//System.out.println(dict.get("a"));	
			while (keys.hasMoreElements()) {
	            String key = keys.nextElement();
	            int value = values.nextElement();
	            arr.add(new LetterCount(key, value));
//	            System.out.println("Key: " + key + ", Value: "
//	                               + dict.get(key));
	        }
			Collections.sort(arr, new Comparator<LetterCount>(){

				  public int compare(LetterCount n1, LetterCount n2)
				  {
				     return n2.value() - n1.value();
				  }
				});
			System.out.println("table of the top 5 most common letters sorted from highest to lowest including letter name, amount of appearences and the %of text  it takes");
			for (int i = 0; i <= 4; i++) {
				LetterCount lc = arr.get(i);
				//System.out.println(lc.key() + "|" + lc.value() + "|" + (lc.value()/n) * 100 + "%");
				System.out.printf("value: %s | %d | %f %% \n", lc.key(), lc.value(), (lc.value()/n) * 100);
			}
	}
}
















































































//package test1;
//
//import java.util.Scanner;
//
//	public class Test2 {
//		static Scanner reader = new Scanner (System.in);
//		public static Void main (String[]args) {
//			int n, k, n2,n3,n4 = 0;
//			
//			n = reader.nextInt ();
//			k = (int) (Math.log10(n) + 1);
//			for (int i = 0; i <= k; i++) {
//				n3 = n%10;
//				n3 = 9-n3;
//				n4 += n3 * 10^i;	
//				
//			}
//			
//			System.out.println(n4);		
//		return null;
//	}
//}
