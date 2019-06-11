package week1.day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=-20;
		if(x > 0 && y>0){
			System.out.println(" Both numbers are positive");
		}
		
		else if(x>0 || y>0){
			System.out.println(" One number is only positive");
		}
		else{
			System.out.println(" x and y are zero");
		}
		
	}

}

//write else if statement to print "Both are negative numbers when x and y are negative.

//change the program to check for x=0
