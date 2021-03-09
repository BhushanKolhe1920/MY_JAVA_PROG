import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        Amazonprime aa[] = new Amazonprime[4];
        for(int i=0;i<aa.length;i++){
            int pid = sc.nextInt();
            sc.nextLine();
            String username = sc.nextLine();
            int subpac = sc.nextInt();
            sc.nextLine();
            String show = sc.nextLine();
            int views = sc.nextInt();
            
            aa[i] = new Amazonprime(pid,username,subpac,show,views);
        }
        
        int inp1= sc.nextInt();
        int inp2= sc.nextInt();
        sc.nextLine();
        String inp3 = sc.nextLine();
        
        int out1 = findRemainingSubcriptionDays(aa,inp1,inp2);
        if(out1<=0){
            System.out.println("Its time to refill");
        }
        
        else{
            System.out.println(out1);
        }
        
        //call 2
        
        Amazonprime out2[] = findDetailsForGivenShow(aa,inp3);
        if(out2==null){
            System.out.println("No such shows available");
        }
        
        else{
            
            for(int i=0;i<out2.length;i++){
                System.out.println(out2[i].getpid());
                System.out.println(out2[i].getusername());
                System.out.println(out2[i].getviews());
            }
        }
        
    }
    
    //method inp1
    public static int findRemainingSubcriptionDays(Amazonprime aa[],int inp1, int inp2){
        int val=0;
        for(int i=0;i<aa.length;i++){
            if(aa[i].getpid() == inp2){
                val = aa[i].getsubpac() - inp1;
            }
        }
        
        return val;
        
    }
    
    
    
    
    //method 2
    
    public static Amazonprime[] findDetailsForGivenShow(Amazonprime[] aa, String inp3){
        int count=0;
        
        for(int i=0;i<aa.length;i++){
            if(aa[i].getshow().equals(inp3)){
                count++;
            }
        }
        
        Amazonprime ret[] = new Amazonprime[count];
        int r=0;
        for(int i=0;i<aa.length;i++){
            
            if(aa[i].getshow().equals(inp3)){
                ret[r] = aa[i];
                r++;
            }
            
        }
        Amazonprime zzz=null;
        for(int i=0;i<ret.length-1;i++){
            for(int j=i+1;j<ret.length;j++){
                if(ret[i].getviews()>ret[j].getviews()){
                    //swap
                    zzz=ret[i];
                    ret[i] = ret[j];
                    ret[j] = zzz;
                    
                }
            }
        }
        
        return ret;
        
    }
    
    
    
}



class Amazonprime{
    
    int pid;
    String username;
    int subpac;
    String show;
    int views;
    
    public Amazonprime(int pid,String username,int subpac,String show,int views){
        
        this.pid=pid;
        this.username=username;
        this.subpac=subpac;
        this.show=show;
        this.views=views;
    }
    
    int getpid(){
    
        return this.pid;
    }
    
    String getusername(){
        return this.username;
    }
    
    String getshow(){
        
        return this.show;
    }
    
    int getsubpac(){
        
        return this.subpac;
    }
    
    int getviews(){
        
        return this.views;
    }
}




