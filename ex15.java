package javaex100;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		//15
		Scanner scan = new Scanner(System.in);
		int yyyy = scan.nextInt();
		int intII = scan.nextInt();
		int dd = scan.nextInt();
		String resultA = String.format("%02d",intII);
		String resultB = String.format("%02d",dd);
		System.out.println(yyyy+"."+resultA+"."+resultB);
	}

}
