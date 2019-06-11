package week1.day2.examples;

public class computeSum {

	public static void main(String[] args) {
		int[] numbers={2,3,4,5};
		int sum = 0;

        for (int i : numbers) {    // ( int i ;)

            sum = sum + i;
        }

            
        }
		
		//int sum=sumArray(numbers);
		
		
	
	
   public static int sumArray(int[] total) {
	            int sum = 0;

	            for (int i : total) {    // ( int i ;)
	
	                sum = sum + i;
	            }

	                return sum;
	            }


}
