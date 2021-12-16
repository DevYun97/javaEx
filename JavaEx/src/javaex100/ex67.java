package javaex100;

import java.util.Scanner;

public class ex67 {

	public static void main(String[] args) {
		//67
		Scanner scan = new Scanner(System.in);
		int countNums = scan.nextInt();
		for(int i=countNums; i>=1; i--) {
			System.out.println(i);
		}
				
		int countNumsB = scan.nextInt();
		while(countNumsB>=1) {
			System.out.println(countNumsB);
			countNumsB--;
		}
	}

}
