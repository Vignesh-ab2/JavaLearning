package taskjava;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
	a.test();
	}

}
class A{
	
	public void test() {
		System.out.println("parent class calling");
		
	}
}
class B extends A{
	
	public void test() {
		System.out.println("child class calling ");
		
	}
}