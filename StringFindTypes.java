package week2.assignments;

public class StringFindTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0,space=0,num=0,specialChar=0;
		char[] charTest=test.toCharArray();
		for(int i=0;i<charTest.length;i++)
		{
			if(Character.isLetter(charTest[i]))
				letter=letter+1;
			if(Character.isDigit(charTest[i]))
				num=num+1;
			if(Character.isSpaceChar(charTest[i]))
				space=space+1;
			else
				specialChar=specialChar+1;
				
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
