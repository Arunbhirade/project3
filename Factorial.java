package Dynamic;

import java.util.Scanner;

public class Factorial {
	static int fact(int f){
		int x=1;
		for(int i=f;i>0;i--){
		x=x*i;	
		}
		return x;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int f=sc.nextInt();
	int y=Factorial.fact(f);
	System.out.println(y);
}
}
