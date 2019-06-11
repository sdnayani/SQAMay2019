package week2.day2.examples;

public class removeCharAtIndex {
	public static void main(String args[]) {
	      String str = "Hello is Java";
	      //String subStr=str.sub
	      //System.out.println(" The substr " +subStr);
	      
	      //thi
	     String s= removeCharAt(str, 3);
	      System.out.println(s);
	   }
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	      
	      //s.substring(0, pos)  --Hel +
	      //s.substring(pos + 1) -o is Java
	      
	      //Helo is Java
	   }
}
