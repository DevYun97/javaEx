package javaex100;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		//28
		Scanner scan = new Scanner(System.in);
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		if(numA%2==0) {
			System.out.println(numA);
		}
		if(numB%2==0) {
			System.out.println(numB);
		}
		if(numC%2==0) {
			System.out.println(numC);
		}
	}

}
