package week1.day1.exercises;

/*
 * Store the first d elements in the temp array.
 */
public class ArrayRotate {

	public static void rotateArray(int[] arr,int d) {
		int[] temp= new int[d];
		
		for(int i=0; i<d; i++) {
		   temp[i]=arr[i];
		}
		for(int i=d; i<=arr.length; i++) {
			arr[i-1]=arr[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 4, 5, 6, 7};
		          //1,3,3,
		rotateArray(arr,2);

	}

}
