package week1.day1.exercises;

public class WeirdNotWeird {
	public static void main(String[] args){
	 int n=3;
     if((n%2==1) || (n%2==0 && (n>=6 && n<=20))) {
     System.out.println("Weird");  		
     
    }
     else if (n%2==0 &&(n>=2 && n<=5) || (n%2==0 && n>20)) {
    	 
    	System.out.println("Not Weird");
      }

   }
	
	
}
