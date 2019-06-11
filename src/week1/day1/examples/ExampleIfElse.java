package week1.day1.examples;

public class ExampleIfElse {

	public static void main(String[] args) {
		
		
	}

	public static String checkCondition(int x, int y){
		String s;
		
		if(x < y ){
			
		     s="X is less than Y";
		}
		else if(x<=y){
		
			s="X is less or equal to  Y";
		}
		
		else if(x==y){
			System.out.println("X is  equal to Y");
			s="X is  equal to Y";
			
		}else if(x>=y){
			
			s="X is  greaterthan or equal  to Y";
		}
		else {
	
			s="X is greater than  Y";
		}
	   return s;
	}

}
