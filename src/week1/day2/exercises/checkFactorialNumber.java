package week1.day2.exercises;

public class checkFactorialNumber {

	/*public static int checkFactorial(int number) {
		int fact=1;
		
		for(int i=1; i<=number; i++) {
			fact=fact*i;
		}
		
		return fact;
	}*/
	public static void main(String[] args) {
		//int fact=checkFactorialNumber.checkFactorial(8);
		//int fact=checkFactorial(8);
		//System.out.println("The Fact " +fact);
		
         int fact=1;
		int number=8;
		for(int i=1; i<=number; i++) {
			fact=fact*i;
		}
		System.out.printf(" The factorial is %d ",fact);
		
	}
	
}
