package week2.day1;

public class StringPalindrome {

	public static void main(String[] args) {
		String name="MADAM";
		String rev = "";
		for (int i=name.length()-1;i >= 0; i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev))
			System.out.println(name+ "  is a palindrome");
		else
			System.out.println(name+ "  is not a palindrome");
		

	}

}
