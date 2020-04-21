package taskjava;

class Example{
	static  int overload1(int a,int b)
	{
		return a+b;
	}
	static double overload2(double c,double d)
	{
		return d+c;
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Example.overload1(1, 2));
		System.out.println(Example.overload2(2.1, 3.4));
	}

}
