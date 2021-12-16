package javaex100;

import java.util.Scanner;

public class ex54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//54
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x=0;
		
		if(b%a==0) {
			x=b/a;
			System.out.println(a+"*"+x+"="+b );
		} else if (a%b==0) {
			x=a/b;
			System.out.println(b+"*"+x+"="+a );
		} else {
			System.out.println("none");
		}
	}

}
