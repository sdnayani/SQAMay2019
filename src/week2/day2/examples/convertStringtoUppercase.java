package week2.day2.examples;

public class convertStringtoUppercase {
    
	   public static void main(String[] args)
	    {
	        
	    }
	   public static String convertToUpperCase(String str){
		   //String str = "The Quick BroWn FoX!";

	        // Convert the above string to all uppercase.
	        String upper_str = str.toUpperCase();

	        // Display the two strings for comparison.
	        System.out.println("Original String: " + str);
	        System.out.println("String in uppercase: " + upper_str);
		   
		   return upper_str;
		   
	   }
	}
