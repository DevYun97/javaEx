package javaex100;

import java.util.Scanner;

public class ex58 {

	public static void main(String[] args) {
		//58 		
		Scanner scan = new Scanner(System.in);
		int triangleA = scan.nextInt();
		int triangleB = scan.nextInt();
		int triangleC = scan.nextInt();
		if(triangleC<triangleA+triangleB) {
			System.out.println("yes");
			} else {
				System.out.println("no");
			}
	}

}
