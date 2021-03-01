//Program to differentiate between Uppercase,Lowercase,Number,Symbol. 

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		char a = in.charAt(0);
		
		if(Character.isUpperCase(a)){
		    System.out.println("Uppercase");
		}
		
		else if(Character.isLowerCase(a)){
		    System.out.println("LowerCase");
		}
		
		else if(Character.isDigit(a)){
		    System.out.println("Number");
		}
		
		else{
		    System.out.println("Symbol");
		}
	}
}
