package javaex100;

import java.util.Scanner;

public class ex44 {

	public static void main(String[] args) {
		//44
		Scanner scan = new Scanner(System.in);
		int i= scan.nextInt();
		switch(i) {
		case 1:
		case 3:
		case 5:
		case 7:
			System.out.println("oh my god");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("enjoy");
			break;
		default:
		break;
		}
		
		int passA = scan.nextInt();
		int passB = scan.nextInt();
		int passC = scan.nextInt();
		if(passA <=170) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH");
		}
		if(passB <=170) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH");
		}
		if(passC <=170) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH");
		}
	}

}
