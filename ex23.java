package javaex100;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		//23
		Scanner scan = new Scanner(System.in);
		int aTT = scan.nextInt();
		int bTT = scan.nextInt();
		if(aTT==bTT) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
