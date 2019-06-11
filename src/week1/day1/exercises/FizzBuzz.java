package week1.day1.exercises;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<30; i++) {
		if(i%3==0) {
			System.out.printf("The value is %d Fizz ",i);
			System.out.println();
		}
		if(i%5==0) {
			System.out.printf("The value is %d Buzz ",i);
			System.out.println();
		}
		
		if((i%3==0) && (i%5==0)){
			System.out.println(" FizzBuzz");
			System.out.println();
		}
		

	  }
	}
}
