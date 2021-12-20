package javaex100;

import java.util.Scanner;

public class ex55 {

	public static void main(String[] args) {
		//55
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		if(c>=90) {
			System.out.println("A");
		} else if(c>=80) {
			System.out.println("B");
		} else if(c>=70) {
			System.out.println("C");
		} else if(c>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
