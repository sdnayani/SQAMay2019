package week3.day4.examples;

public class StringBuilderDemo {

	public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
         
        StringBuilder sb = new StringBuilder(palindrome);
        
        sb.reverse();  // reverse it
        sb.deleteCharAt(2);
        
        
        System.out.println(sb);
    }

}
