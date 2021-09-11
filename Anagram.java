package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String t1 = "spot";
		String t2 = "pots";
		
		char[] ch1 = t1.toCharArray();
		char[] ch2 = t2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean res =Arrays.equals(ch1, ch2);
		if(res) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}

}
}
