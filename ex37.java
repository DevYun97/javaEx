package javaex100;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
//		37
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=x; j++) {
				System.out.print("*");
			}System.out.println("");
		}
	}

}
