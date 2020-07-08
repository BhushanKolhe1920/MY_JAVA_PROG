import java.util.*;
public class Main
{
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter how many elements");
	int n = sc.nextInt();
		int[] a=new int[n];
	for  (int i=0;i<n;i++)
	{
	a[i] = sc.nextInt();
	
	}
	
	int max_diff= maxdifffunc(a);
	System.out.println("Maximum Difference in eneterd array is : "+max_diff);
	}
	
	
	public static int maxdifffunc(int a[])
	{
	    int i,j;
	    int max_d=0;
	    for (i=0;i<a.length;i++){
	        for(j=i+1;j<a.length;j++){
	            
	            if(a[j]>a[i]){
	                max_d=Math.max(max_d,a[j]-a[i]);
	                
	            }
	        }
	
	
	    }
	    
	    return max_d;
	}
	
	
}
