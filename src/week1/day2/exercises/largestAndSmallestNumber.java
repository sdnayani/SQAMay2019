package week1.day2.exercises;

public class largestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2,3,5,6,1,22};
		int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {

            if(numbers[i]>Max) {
                    Max=numbers[i];
                  }

            else if(numbers[i]< Min) {
                 Min=numbers[i];
                 }
        
	    }
   System.out.printf(" The max %d and Min value is %d ", Max,Min);
   }
}	
