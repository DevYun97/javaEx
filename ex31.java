package javaex100;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
//		31
		Scanner scan = new Scanner(System.in);
		int numS = scan.nextInt();
		if(numS>=90) {
			System.out.println("A");
		} else if(numS >=70){
			System.out.println("B");
		} else if(numS >=40){
			System.out.println("C");
		} else if(numS >=0){
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
