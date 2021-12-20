package javaex100;

import java.util.Scanner;

public class ex47 {

	public static void main(String[] args) {
		//47 윤년판별
		Scanner scan = new Scanner(System.in);
		int yearNums = scan.nextInt();
		if( yearNums%4==0 && yearNums%100!=0) {
			System.out.println("yes.(1번 조건) " + yearNums + "년" );
		} else if(yearNums%400==0) {
			System.out.println("yes.(2번 조건) " + yearNums + "년");
		} else {
			System.out.println("no " + yearNums + "년");
		}
	}

}
