package week1.day1.exercises;

public class checkAmstrongNumber {
	
	public static Boolean checkIsAmstrongNumber(int number) {
		int sum=0;
		int n=number;
		
		while(n>0) {
			int a =n%10;
			n=n/10;
			sum=sum+(a*a*a);
		}
		if(sum==number) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //153
		Boolean isAmstrong=checkAmstrongNumber.checkIsAmstrongNumber(153);
		System.out.println(" The Amstrong number " +isAmstrong);
		
	}

}
