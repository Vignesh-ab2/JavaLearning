package taskjava;

public class staticExample {

	
		static int count=0;

		staticExample(){
		count++;
		System.out.println(count);
		}
		void display()
	    {
	    	System.out.println(count);
	    }  

		public static void main(String args[]){

			staticExample c1=new staticExample();
			staticExample c2=new staticExample();
			staticExample c3=new staticExample();
			c1.display();

		}
		

}
