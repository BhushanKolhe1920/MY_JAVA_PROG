import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args){
        String a,b;
        StringBuffer sb;
        Scanner sc= new Scanner(System.in);
        a=sc.nextLine();
        sb = new StringBuffer(a);
        b=sb.reverse().toString();
        if(a.equals(b))
        {
            System.out.println("Palindrome");
            
        }
        
        else{
            System.out.print("Not a palindrome");
        }
}}
