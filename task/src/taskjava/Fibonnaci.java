  package taskjava;

public class Fibonnaci {

	public static void main(String[] args) {
		
int n=10;
int n1=0;
int n2=1;
int x;

for(int i=2;i<n;++i)
{
	x=n1+n2;
	System.out.println(" "+x);
	n1=n2;
	n2=x;
}
	}

}
