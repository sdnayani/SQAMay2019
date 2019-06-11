package week1.day2.examples;

public class ExampleArrays {
	 
	int b=20;
	int c,d,e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Why arrays?
		//Imagine we want to store bunch of data like this which is 
		//inefficient.
		int a1=10; 
		int b1=20;
		int c,d,e;
		c=30;
		d=40;
		e=50;
		
		int result=c+d;
			
		int[] a= {10,20,40,50,60,40};
		//printing a[2] and a[4]
		System.out.println(a[2] + " " +a[3]);
		//loop 
		
		//Enhanced For
		//for(datatype of array: arrayname)
		for(int temp:a){
			System.out.println(temp);
		}
		for(int i=0;i<a.length;i++){
			System.out.println(" The array val " +a[i]);
		}
		//creating an empty array with default values.
		int[] x= new int[5];
		//assign the values later.
		x[3]=25;
		x[0]=10;
		System.out.println("--------- temp int  Array------");
		for(int temp2: x){
			System.out.println(" print " +temp2);
			
		}
		
		double[] b ={12.2,13.2,13.4,15.4};
		for(double temp2: b){
			System.out.println(" print " +temp2);
			
		}
	}

	public static int sum(int a,int b){
		int result=a+b;
		
		return result;
		
	}
}
