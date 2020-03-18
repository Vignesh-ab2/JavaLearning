package taskjava;

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Dog{  
void meow(){System.out.println("meowing...");}  
}  
class lion extends Cat
{
	void roars(){System.out.println("Roaring...");}  
}

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion c=new lion();  
		c.meow();  
		c.eat();
		c.bark();
		c.roars();
	}
}
