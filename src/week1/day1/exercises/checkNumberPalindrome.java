package week1.day1.exercises;

import java.util.Scanner;

public class checkNumberPalindrome {

	public static void  checkNumberIsPalindrome(int number) {
		
		int n= number;
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
	
	public static void fibonacciSeries(int count) {
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1 + " "+n2);
		
		for(int i=2; i<count; i++) {
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkNumberPalindrome.checkNumberIsPalindrome(454);
		//checkNumberPalindrome.checkPalindromeSecondWay();
		checkNumberPalindrome.fibonacciSeries(10);

	}

}
