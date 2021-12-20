package javaex100;

import java.util.Scanner;

public class ex60 {

	public static void main(String[] args) {
		//60
		Scanner scan = new Scanner(System.in);
		int car = 170;
		int tA = scan.nextInt();
		int tB = scan.nextInt();
		int tC = scan.nextInt();
				
		if(car >= tA) {
			System.out.println("CRASH " + tA);
		} else if(car >= tB) {
			System.out.println("CRASH " + tB);
		} else if(car >= tC) {
			System.out.println("CRASH " + tC);
		} else {
			System.out.println("PASS");
		}
	}

}
