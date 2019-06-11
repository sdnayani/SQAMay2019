package week2.day2.examples;

public class convertToCharArray {

	public static void main(String[] args) {
		String Str = new String("Welcome to strCharArray.com");
		
           char[] arr= new char[Str.length()];
	      System.out.print("Return Value :" );
	      System.out.println(Str.toCharArray() );
	      arr=Str.toCharArray();
	   }

	}


