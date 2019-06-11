package week3.day4.examples.collections;

import java.util.ArrayList;

import java.util.*;

public class ArrayListExample {
   public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	     ArrayList<String> alist=new ArrayList<String>(); 
	     //ArrayList<Integer>aListInts=new ArrayList<Integer>();
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	      alist.add("Steve");

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+alist);

	  /*Add element at the given index*/
	  //alist.add(0, "Rahul");
	  alist.add(1, "Justin");
	 

	  /*Remove elements from array list like this*/
	  alist.remove("Steve");
	  //alist.remove("Steve");
	  //alist.remove("Harry");

	  System.out.println("Current array list is:"+alist);

	  /*Remove element from the given index*/
	  alist.remove(1);

	  //System.out.println("Current array list is:"+alist);
	  //iterating ArrayList
	     for(String str:alist)  
	        System.out.println(str);  
	     } 
   }

