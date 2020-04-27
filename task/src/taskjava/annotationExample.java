package taskjava;

public class annotationExample {
	
	public static void main(String[] args) {
		Computer tab = new Tablet();
		tab.whatIsIt();		
	}
}

	class Computer{
	
		public void whatIsIt()
		{
			System.out.println("This is a computer");
		}
	}
	
	class Tablet extends Computer
	{
		@Override
		public void whatIsIt()
		{
			System.out.println("This is a tablet");
		}
	}

