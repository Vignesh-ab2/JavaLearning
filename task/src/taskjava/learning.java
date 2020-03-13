package taskjava;

public class learning {
	static boolean isPrime(int n) 
	{ 
		for (int i = 2; i < n; i++) 
		    if (n % i == 0) 
		        return false; 
		  
		return true; 
	} 
	 public static void main(String args[]){  
	     System.out.println("Hello Java");  
	     for(int i=0;i<=10;i++)
	     { 
	    	 System.out.println(i);
	     }
	     System.out.println("");
	     System.out.println("IM PRINTING EVEN NUMBERS");
		 for(int i=0;i<=10;i++)
	     {
	    	 System.out.println(i++);
	     }
		 System.out.println("");
		 System.out.println("IM PRINTING ODD NUMBERS");
		 for(int i=1;i<=10;i++)
	     {
	    	 System.out.println(i++);
	     }
		 
		 System.out.println("");
		 System.out.println("IM PRINTING PRIME NUMBERS");
		 for(int i=2;i<=10;i++)
	     {
			 if (isPrime(i)) 
			 {
			            System.out.print(i + " "); 
			 }
			   
	     }
	    }  
}
