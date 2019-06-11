package week3.day1.examples;

public class convertIntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=23;
		Double d=84.53;
		//convert Integer to String..
		String str=Integer.toString(x);
		String str2=Double.toString(d);
		System.out.println(" The int converted to String "+str);
		System.out.println(" The Double converted to String "+str2);
		String s="34";
		String s1="34.545";
		//convert String to Integer val;
		int val=Integer.parseInt(s);
		double d1= Double.parseDouble(s1);
		val=val+2;
		System.out.println(" The int " +val);
	}

}
