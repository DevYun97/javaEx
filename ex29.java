package javaex100;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
//		29
		Scanner scan = new Scanner(System.in);
		int numD = scan.nextInt();
		int numE = scan.nextInt();
		int numF = scan.nextInt();
		if(numD%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(numE%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(numF%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
