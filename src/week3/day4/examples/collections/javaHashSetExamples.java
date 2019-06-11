package week3.day4.examples.collections;

import java.util.*;

public class javaHashSetExamples
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> hset = new LinkedHashSet<String>();
 
        // adding into HashSet
    	//HashSet<String> hset = new HashSet<String>();
        hset.add("India");
        hset.add("Australia");
        hset.add("South Africa");
        hset.add("India");// adding duplicate elements
        hset.add("India");
        // printing HashSet
        System.out.println(hset);
        System.out.println("List contains India or not:" +
                           hset.contains("India"));
        // Removing an item
        hset.remove("Australia");
        System.out.println("List after removing Australia:"+hset);
 
        // Iterating over hash set items
        System.out.println("Iterating over list:");
        
        Iterator<String> i = hset.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        /* public void clear(): It removes all the elements
         * from HashSet. The set becomes empty after this
         * method gets called.
         */
        hset.clear();
    
        
    }
    
    	
    }
