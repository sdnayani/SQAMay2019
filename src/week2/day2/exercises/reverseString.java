package week2.day2.exercises;

public class reverseString {

	public static void main(String[] args) {
		String str="Dot saw I was Tod";
		String reverse=reverseTheString(str);
		System.out.println(" The reverse Palindrome "+reverse);
    }
	
	public static String reverseTheString(String str) {
		 //String palindrome = "Dot saw I was Tod";
	        int len = str.length();
	        char[] tempCharArray = new char[len];
	        char[] charArray = new char[len];
	        
	        // put original string in an 
	        // array of chars
	        for (int i = 0; i < len; i++) {
	            tempCharArray[i] = 
	                str.charAt(i);
	        } 
	        
	        // reverse array of chars
	        for (int j = 0; j < len; j++) {
	            charArray[j] =
	                tempCharArray[len - 1 - j];
	        }
	        
	        String reversePalindrome =
	            new String(charArray);
	        System.out.println(reversePalindrome);
			return reversePalindrome;
		
	}

}
