package javaex100;

import java.util.Scanner;

public class ex40 {

	public static void main(String[] args) {
//		40
		Scanner scan = new Scanner(System.in);
		float wff = scan.nextFloat();
		if(wff>=50 && wff<=60) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}

}
