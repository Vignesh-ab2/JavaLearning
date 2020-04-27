package taskjava;

import java.io.Console;
public class AnalyzeInput {

	public static void main(String[] args) {
		Console cons;
		String line="";
		System.out.println("SSSS");
		
		if((cons=System.console())!=null && (line=cons.readLine())!=null)
		{
			
			System.out.println("U Typed:"+line);
		}
	}

}
