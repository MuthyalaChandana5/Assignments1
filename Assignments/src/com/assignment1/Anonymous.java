package com.assignment1;

public class Anonymous {
	
public static void main(String args[]) {
			
	  People p = new People(){
		  
	      public void listen() {
			   System.out.println("hearing");
		   }
	   };
	   p.listen();
		 
 }

}
