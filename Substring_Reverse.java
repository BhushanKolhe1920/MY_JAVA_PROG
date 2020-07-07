import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) 
	{
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);
	String str1=sc.nextLine();
	
	int n= str1.length();
	System.out.println(n);
	
	String out = reverses(str1,n);
	
	System.out.println(out);
	System.out.println(out.length());
	
	}
	
	static String reverses(String str1, int n)
	{
	   
	    String[] sp = str1.split(" ");
	    String mainn="";
	    for (int i=0;i<sp.length;i++)
	    {
	        StringBuilder sb = new StringBuilder(sp[i]);
	        mainn = mainn + sb.reverse();
	        
	        if(i<sp.length-1)
	        {
	            mainn = mainn + " ";
	        }
	        
	    }
	   
	    return mainn;
	 
}


}

