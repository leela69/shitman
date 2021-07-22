package jul5_collections;

import java.util.ArrayList;
import java.util.Iterator;

import jun5.list;

public class ArrayListExample {
	
	 public static void main(String args[]){  
		  ArrayList<String> list = new ArrayList<String>(); //Creating arraylist
		  
		      list.add("Santosh");//Adding object in arraylist    
		      list.add("Naveen");    
		      list.add("Shiva");    
		      list.add("Pavan");    
		      //Printing the arraylist object   
		      System.out.println(list);  
		      }
	
	  Iterator itr = list.iterator(); //getting the Iterator  
	  {
      while(itr.hasNext()){//check if iterator has the elements  
       System.out.println(itr.next());//printing the element and move to next
}
      Object list;
	//print using for each
      for(String name:list) 
      {
    	    System.out.println(name);    
      }
      
}
}	
