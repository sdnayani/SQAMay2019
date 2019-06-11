package week2.day2.exercises;

public class StringDemo {
    public static void main(String[] args) {
        String str="doT saw I was toD";
       char[] copyString= copyString( str);
       
       System.out.println(" The copyString "+ new String (copyString ));
    }

  public static char[] copyString(String str){
	//  String palindrome = "Dot saw I was Tod";
      int len = str.length();
      char[] tempCharArray = new char[len];
  
      
      // put original string in an 
      // array of chars
      for (int i = 0; i < len; i++) {
          tempCharArray[i] = 
        		  str.charAt(i);
      } 
      
	  return  tempCharArray;
  }
}
