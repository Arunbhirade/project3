package Dynamic;

import java.util.Scanner;

 
public class Numerreverse {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("the given no. is");
     int x=s.nextInt();
    reverse(x);
}
	static void reverse(int no){
		int rev=0;
		while(no!=0){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		System.out.println(rev);
	}
}
