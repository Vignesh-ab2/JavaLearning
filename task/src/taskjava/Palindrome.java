package taskjava;

import java.util.*;
public class Palindrome {

	public static void main(String args[])  
	   {  
	      String originalname, reversename = ""; 
	      Scanner s = new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	      originalname = s.nextLine();   
	      int length = originalname.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	    	  reversename = reversename + originalname.charAt(i);  
	      if (originalname.equals(reversename))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println( " isn't a palindrome.");   
	      
	   }  
}
