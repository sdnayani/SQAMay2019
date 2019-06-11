package week1.day1.exercises;

import java.util.Scanner;

public class checkPrimeNumbers {
	
	/*
	 * Given the Number.Check if the Number is Prime Number or Not by getting User Input.
	 */
	
public static void checkPrimes() {
	Scanner input= new Scanner(System.in);
	int number=input.nextInt();
	isPrime(number);
	input.close();
	
	
}

public static void checkFactorialNumber(int number) {
	int fact=1;
	
	for(int i=1; i<=number; i++) {
		fact=fact*i;
	}
	System.out.printf(" The factorial is %d ",fact);
}

public static void isPrime(int number) {
	
	for(int i=0; i<Math.sqrt(number); i++) {
		if(number%i==0) {
			System.out.printf(" \nThe Number %d is not Prime Number \n",number);
			 return;
		}
	}
	System.out.println();
	System.out.printf(" The Number %d is  Prime Number",number); 	
}
	
	public static void printPrimes(int number) {
		int m= number/2;
		
		for(int i=2; i<m; i++) {
			
			if(number%i==0) {				
				System.out.printf(" \nThe Number %d is not Prime Number \n",number);
				 return;
			}
		}
		System.out.println();
		System.out.printf(" The Number %d is  Prime Number",number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		/*while(i<30) {
		checkPrimeNumbers.printPrimes(i);
		i++;
		}*/
		checkFactorialNumber(4);
	}

}
