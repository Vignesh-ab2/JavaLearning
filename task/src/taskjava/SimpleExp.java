package taskjava;

public class SimpleExp {

	public static void main(String[] args) {
		
//		 String text = null;
//
//	        System.out.println("Go Java Go!");
//	        System.out.println(text.length());
//	        System.out.println("done");
		
		// declare a string of a fixed length
		String text = "I <3 bananas"; // 12 characters long
		// provoke an exception
		char character = text.charAt(9); // get the 15th element
		// you will never see this print
		System.out.println("do"+character+"e");
		
	}

}
