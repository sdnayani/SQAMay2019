package week3.day1.examples;

public class countDigitsBeforeAndAfterDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDigitsBeforeAndAfterDecimal(143.32);

	}
	public static void countDigitsBeforeAndAfterDecimal(Double d){
		//d=854.23;
		//12-66
		String s=Double.toString(d);
		int dot=s.indexOf('.');
		System.out.println(dot + " digits " +
	            "before decimal point.");
		System.out.println(s.length()-dot-1 + " after the decimal point");
	}

}
