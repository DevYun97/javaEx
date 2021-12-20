package javaex100;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
//		32
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		switch(ch) {
		case 'A':
			System.out.println("best!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;	
		default:
			break;
		}
	}

}
