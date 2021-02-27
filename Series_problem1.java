import java.io.*;
import java.util.*;

class Main{
    
    public static void main(String args[]){
        
        // Even series : 0 2 4 6 8 10
        // Odd series  : 1 3 5 7 9
        
        //Required series : 1 0 3 2 5 4 ...
        System.out.println("Enter test cases : ");
        
        Scanner sc = new Scanner(System.in);
        
        int t=sc.nextInt();
        while(t>=0){
            
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        
        if(n<0){
            System.out.println("Does Not Exist");
        }
        
        else{
            
        
        int b=0;
        int a=1;
        
        ArrayList<Integer> bk = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            if(i%2!=0){
                
                bk.add(a);
                a=a+2;
                
            }
            
            else{
                bk.add(b);
                b=b+2;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(bk.get(i)+"-");
        }
        
        System.out.println("");
        System.out.println("Nth required number is : "+bk.get(bk.size()-1));
        t=t-1;
        }
        }
    }
}
