package week2.day2.examples;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = new String("Welcome:to:java.com:hello-world");
		//String1=Welcome
		//String2=to
		//String3=java.com
	      System.out.println("Return Value :" );  
	      String[] splits=Str.split("-");
	      //splits[0]
	      //splits[1]
	      //splits[2]
	      for (String retval: splits) {
	         System.out.println(retval);
	      }
	   }

	}

