package week1.day2.exercises;

import java.util.Scanner;

public class checkNumberPalindrome {

	

	public static void checkPalindromeSecondWay() {

		Scanner input= new Scanner(System.in);
		String number=input.next();
		String reverse="";
		System.out.println("Enter the String is a Palindrome");
		
		for(int i=0; i<number.length(); i++) {
			
			reverse=reverse+number.charAt(number.length()-i-1);
		}
		System.out.println(" The reverse number " +reverse);
		
		if(number.equals(reverse)) {
			System.out.println(" This is Number Palindrome");
		}
		else {
			System.out.println(" This is Not Number Palindrome");
		}
		
	}
	
	
	public static void main(String[] args) {
		int n= 454;
		int number=n;
		int sum=0;
		
		while(n>0) {
			
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
		
		if(number==sum) {
			System.out.println("Is Palindrome number");
		}
		else {
			System.out.println("Is Not Palindrome number");
		}
		
		
	}

}
