package javaex100;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		//20
		Scanner scan = new Scanner(System.in);
		int numAQ = scan.nextInt();
		int numBQ = scan.nextInt();
		int numCQ = scan.nextInt();
		System.out.println(numAQ + numBQ + numCQ);
		System.out.println((numAQ + numBQ + numCQ)/3f);
	}

}
