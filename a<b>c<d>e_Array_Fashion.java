import java.util.Scanner;
public class Main{
    
    public static void main(String[] rgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will sort array in the following manner a<b>c<d>e....");
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter elements one by one");
        int arr[] = new int[n];
        int temp;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
           
                
                if(i%2==0){
                    if(arr[i] > arr[i+1]){
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        
                    }
                }
                
                
                else{
                    if(arr[i]<arr[i+1]){
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
            }
            
            
        
        System.out.println("Array in the form of a<b>c<d>e<f>g.....");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    
        
        
    }
}
