//Program to check square of number ends with same number

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// 1st Algorithm 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int N = sc.nextInt();
		
		if(N<0){
		    System.out.println("Wrong Input");
		}
		
		else{
		    
		
		int sq = N*N;
		ArrayList<Integer> bk = new ArrayList<Integer>();
		ArrayList<Integer> bk1 = new ArrayList<Integer>();
		while(N!=0){
		    bk.add(N%10);
		    N=N/10;
		}
		
		System.out.println("Numbers in N : "+bk);
		
		while(sq!=0){
		    bk1.add(sq%10);
		    sq=sq/10;
		}
		
		System.out.println("Numbers in Square : "+bk1);
		
		int Tp =0;
		for(int i=0;i<bk.size();i++){
		    if(bk.get(i)==bk1.get(i)){
		        Tp++;
		    }
		}
		
		if(Tp==bk.size()){
		    System.out.println("Correct Number");
		}
		
		else{
		    System.out.println("Incorrect Number");
		}
	}
	
	   /* 
	    //2nd Algorithm :
	    
	    Scanner sc  = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    if(N<0){
	        System.out.println("Wrong Input");
	    }
	    
	    else{
	        
	    
	    int sq = N*N;
	    int k=0,m=0;
	    int N1=N;
	    
	    while(N1!=0){
	        N1=N1/10;
	        m++;
	    }
	    while(N!=0){
	        if(N%10==sq%10){
	            
	            N=N/10;
	            sq=sq/10;
	            k++;
	       
	            
	            if(k==m){
	                System.out.println("CorrectNumber");
	                break;
	            }
	            
	            continue;
	        }
	        
	        else{
	            System.out.println("Incorrect Number");
	            break;
	        }
	    }
	    }
	    */
	}
}
