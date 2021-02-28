
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		ArrayList<Integer> bk = new ArrayList<Integer>();
		
		
		for(int i=0;i<X;i++){
            bk.add(sc.nextInt());
		}
		
		Collections.sort(bk);
		
		int N = sc.nextInt();
		
		
		System.out.print(bk.get(N-1));
	}
}
