package week2.day2.examples;

public class StringDemo {
    public static void main(String[] args) {
        
    }

  public static String copyString(String str){
	//  String palindrome = "Dot saw I was Tod";
      int len = str.length();
      char[] tempCharArray = new char[len];
  
 
      
      // put original string in an 
      // array of chars
      for (int i = 0; i < len; i++) {
          tempCharArray[i] = 
        		  str.charAt(i);
      } 
      
	  return new String(tempCharArray);
  }
}
