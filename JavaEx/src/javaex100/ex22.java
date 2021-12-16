package javaex100;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numAS = scan.nextInt();
		int numBS = scan.nextInt();
		if(numAS > numBS) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
