//Nth Smallest And Nth Largest element inn an ArrayStoreException
import java.util.Scanner;
class Main{
    
    public static int[] sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        return arr;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] =new int[size];
        for(int k=0;k<size;k++){
            arr[k] = sc.nextInt();
        }
        int N = sc.nextInt();
        int arr2[] = sort(arr);
        System.out.println("Sorted array list : ");
        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+"  ");
        }
        System.out.println("");
        System.out.println("Nth Smallest number is : "+arr2[N-1]);
        System.out.println("Nth largest number : "+arr[size-N]);
    }
}
