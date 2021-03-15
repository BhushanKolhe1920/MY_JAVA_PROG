import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Account account[] = new Account[n];
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int no_of_ac=sc.nextInt();
            sc.nextLine();
            String ac=sc.nextLine();
            double balance=sc.nextDouble();
            
            account[i] = new Account(num,no_of_ac,ac,balance);
        }
        
        
        Account out1=findAccountWithSecondLargest(account);
        Account out2=findAccountWithThirdLargest(account);
        
        System.out.println("First Four : ");
            System.out.println(out1.getnum());
            System.out.println(out1.getno_of_ac());
            System.out.println(out1.getac());
            System.out.println(out1.getbalance());
        
        
        System.out.println("Second Four : ");
        
            System.out.println(out2.getnum());
            System.out.println(out2.getno_of_ac());
            System.out.println(out2.getac());
            System.out.println(out2.getbalance());
        
    }
    
    
    
    
    public static Account findAccountWithSecondLargest(Account a[]){
        Account temp=null;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].getno_of_ac()>a[j].getno_of_ac()){
                   temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        
        if(a.length==0){
            return null;
        }
        
        else if(a.length==1){
            return a[0];
        }
        
        else{
            return a[1];
        }
    }
    
    public static Account findAccountWithThirdLargest(Account a[]){
        Account temp1=null;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].getno_of_ac()>a[j].getno_of_ac()){
                    temp1=a[i];
                    a[i]=a[j];
                    a[j]=temp1;
                }
            }
        }
        
        if(a.length==0){
            return null;
        } 
        
        else if(a.length==1){
            return a[0];       
            }
            
        else{
            return a[2];
        }
    
    

    
    }
}

class Account{
    int num;
    int no_of_ac;
    String ac;
    double balance;
    
    Account(int num,int no_of_ac,String ac,double balance){
        this.num=num;
        this.no_of_ac=no_of_ac;
        this.ac=ac;
        this.balance=balance;
    }
    
    int getnum(){
     return this.num;   
    }
    
    int getno_of_ac(){
        return this.no_of_ac;
    }
    
    String getac(){
        return this.ac;
    }
    
    double getbalance(){
        return this.balance;
    }
    
}
