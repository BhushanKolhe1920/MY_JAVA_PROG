import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		
		System.out.println("Enter numbers");
		
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
		int min=mindiff(a);
		System.out.println("Min difference is : "+min);
	}

    
    public static int mindiff(int a[]){
        
        
        int mind=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            
            for(int j=i+1;j<a.length;j++){
                
                if(a[j]>a[i]){
                    
                    mind = Math.min(mind,a[j]-a[i]);
                }
            }
        }
        
        return mind;
    }
    
    
}
