package javaex100;

import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//42
		int a = scan.nextInt();
		if(a >=50 && a <=70 || a%6==0) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
