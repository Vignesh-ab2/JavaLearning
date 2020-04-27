package taskjava;

import java.util.*;
public class Array {

	public static void main(String[] args) {
		String text[] =new String[ ] {"Design","AI","Core", "BIGDATA" };
        Arrays.sort(text);
        System.out.println(Arrays.toString(text));
        for (int i = 0; i < (text.length); i++)
        {
        	String newline=System.getProperty("line.separator");
            System.out.print(text[i] +newline);
        }
	}

}
