package week2.day2.exercises;

import java.util.Arrays;

public class BinarySearch {
	/*Binary search is a fast search algorithm with run-time complexity of Ο(log n). This search algorithm works on the principle of divide and conquer. For this algorithm to work properly, 
	 * the data collection should be in the sorted form.*/
	
	 


		public static void main(String args[]){
			
		      int array[] = {10, 20, 25, 57, 63, 96};
		      int size = array.length;
		      int low = 0;
		      int high = size-1;
		      int value = 63;
		      int mid = 0;
		      mid = (low +high)/2;

		      while(low<=high){
		         if(array[mid] == value){
		            System.out.println(mid);
		            break;
		         }
		         
		         else if(array[mid]<value) {
		         low = mid+1;
		         
		      }
		      else if(array[mid]>value) {
			         high = mid-1;
			         
			      }
		      mid = (low+high)/2;
		   }
		}
	
}
