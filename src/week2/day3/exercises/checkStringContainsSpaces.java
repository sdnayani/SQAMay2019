package week2.day3.exercises;

public class checkStringContainsSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=countNumberOfSpaces(" Hello    World   Java");
		 System.out.println(" The count " +count);
		 

	}
	
	public static int countNumberOfSpaces(String str){
		int count=0;
		
		
		//char[] arr=str.toCharArray();
		for(char ch:str.toCharArray()){
			if(Character.isWhitespace(ch)){
				count+=1;
			}
		}
		return count;
	}

}
