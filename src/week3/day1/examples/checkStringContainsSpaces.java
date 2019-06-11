package week3.day1.examples;

public class checkStringContainsSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=checkStringContainsSpaces(" Hello    World   Java");
		 System.out.println(" The count " +count);
		 

	}
	
	public static int checkStringContainsSpaces(String str){
		int count=0;
		//Hello
		char[] arr= new char[8];
		//Hello
		char[] arr1={'H','e','l','l','o'};
		arr=str.toCharArray();
		for(char ch:str.toCharArray()){
			if(Character.isWhitespace(ch)){
				count+=1;
			}
		}
		return count;
	}

}
