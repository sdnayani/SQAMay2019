package week3.day4.examples;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDigitsBeforeAndAfterDecimal(14344.3244);

	}
	public static void countDigitsBeforeAndAfterDecimal(Double d){
		//d=854.23;
		String s=Double.toString(d);
		int dot=s.indexOf('.');
		System.out.println(dot + " digits " +
	            "before decimal point.");
		System.out.println(s.length()-dot-1 + " after the decimal point");
	}

}
