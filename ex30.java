package javaex100;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
//		30
		Scanner scan = new Scanner(System.in);
		int numG = scan.nextInt();
		if(numG>0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		if(numG%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
