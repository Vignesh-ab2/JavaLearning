package taskjava;

public class Examples {
	Examples(){System.out.println("Example java");}
	
	int id=1;
	String name;
	public void display(int id,String name){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){
		Examples ex=new Examples();
		ex.display(1,"nm1");
		ex.display(2, "namo");
	}
}
