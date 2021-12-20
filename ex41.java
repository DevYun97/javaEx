package javaex100;

import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		//41
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		if( k>=30&&k<=40 || k >=60 && k<=70 ) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
