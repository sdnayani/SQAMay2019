package week1.day1.exercises;

public class ArrayExercises {
	
	public static void copyElementsOfArray(int[] arr) {
		int[] arr2=new int[arr.length];
		System.arraycopy(arr, 0, arr2,0, arr.length);
	    for(int i=0; i<arr2.length; i++) {
	    	System.out.print(arr2[i] + " ");
	    }
	}
	//[1,2,3,4,5]
	//3,4,5,1,2]
	//Rotate the array by d positions..
	public static void leftRotateArray(int[] arr,int d) {
		for(int i=0; i<d; i++) {
			 LR(arr);
			 
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void LR(int[] arr) {
		int temp=arr[0];
		int i=0;
		for(i=0; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		
	}
     
	public static void  getFrequency(int[] arr) {
		
		int[] freq= new int[arr.length];
		int visited=-1,validate=-1;
	    for(int i=0; i<arr.length; i++) {
		    int count=1;
	    	for(int j=i+1; j<arr.length; j++) {
	    		
	    		if(arr[i]==arr[j]) {
	    	    count++;
	    	    freq[j]=visited;
	    		   
	    		}
	      }
	    	if(freq[i]!=visited) {
	    		freq[i]=count;
	    	}
	  }
	    System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");    
        
        for(int i=0; i<freq.length; i++) {
        	if(freq[i]!=visited) {
        		System.out.println("    " + arr[i] + "    |    " + freq[i]);  
        	}
        }
	    
	}    
   
	public static void binarySearch(int[] arr,int first,int last,int key) {
	     int mid=first+last/2;
	     
	     while(first<=last) {
	    	 
	    	 
	    	 if(arr[mid]<key) {
	    		 first=mid+1;
	    	 }
	    	 else if(arr[mid]== key) {
	    		 System.out.printf("Element %d found at index %d",key,mid);
	    		 break;
	    	 }
	    	 
	    	else if(arr[mid]>key) {
	    		 last=mid-1;
	    	 }
	    	 mid=(first+last)/2;
	     }
	     
	     if(first>last) {
	    	 System.out.println("Element not found");
	    	 
	     }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //int[] arr=new int[] {1,2,3,4,5};
     int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
     //ArrayExercises.copyElementsOfArray(arr);
     
     //ArrayExercises.leftRotateArray(arr, 2);
    ArrayExercises.getFrequency(arr);
     int arr1[] = {10,20,30,40,50};
     int key=30;
     int last=arr.length-1;
     ArrayExercises.binarySearch(arr1, 0, last, key);
     
	}
}