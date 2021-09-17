package week2.assignments;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		int flag = 0;
		if (text1.length() == text2.length()) {
			char[] charText1 = text1.toCharArray();
			char[] charText2 = text2.toCharArray();
			Arrays.sort(charText1);
			Arrays.sort(charText2);

			for (int i = 0; i < charText1.length; i++) {
				if (charText1[i] != charText2[i])
					flag = 1;
			}

			if (flag == 0)
				System.out.println("The given strings are Anagram");
			else
				System.out.println("The given strings are not Anagram");
		} else
			System.out.println("The given strings are not Anagram");
	}

}
