package week1.day2.examples;

public class ArrayDeclarationExercise {

	public static void main(String[] args) {
		
		double[] d= {10.5,11.5,13.5,14.5,15.6};
		for(double temp2: d){
			System.out.println(" print " +temp2);
			
		}
		int[] x= new int[5];
		x[0]=10;
		x[4]=60;
		for(int temp2: x){
			System.out.println(" print " +temp2);
			
		}
		
	}
}
