
//Use Of this keyword
//Demo of array of objects and passing through Constructor and one method.
//Written by  Bhushan Kolhe
//TCS Xplore learnings

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	/*	Second s1 = new Second(2,5);
		Second s2 = new Second(4,10000);
		s1.display();
		s2.display();
		
		*/
		Second s[] = new Second[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++){
		    int var1 = sc.nextInt();
		    int var2 = sc.nextInt();
		    
                s[i] =  new Second(var1,var2);
		   
		   s[i].display(); 
		}
	}
}


class Second{
    int var1,var2;
    public Second(int var1,int var2){
        this.var1=var1;
        this.var2 = var2;
    }
    
    
    void display(){
        System.out.println(var1 + " - " + var2);
    }
}
