package week3.day1.examples;

//Character is a wrapper class for char.Java provides wrapper class 
// to convert  primitive data type char to Character.

public class CharacterClassExamples {
	public static void main(String args[]) {
		Character ch='a';
		char ch1='b';
		//char,int,double
		//Character - char
		//Double - double
		//Integer - int
		
		//boxing...
		Character ch2=ch1;
		//unboxing...
		char ch3=ch2;
		Character ch5=Character.toUpperCase('a');
	      System.out.println(Character.toUpperCase('a'));
	      System.out.println(Character.isLetter('5'));
	      System.out.println(Character.isDigit('5'));
	      
	   }
}
