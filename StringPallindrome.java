package week2.assignments;

public class StringPallindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println("The given string is a pallindrome");
		else
			System.out.println("The given string is not a pallindrome");

	}

}
