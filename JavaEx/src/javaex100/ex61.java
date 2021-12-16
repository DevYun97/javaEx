package javaex100;

import java.util.Scanner;

public class ex61 {

	public static void main(String[] args) {
		//61
		Scanner scan = new Scanner(System.in);
		int inputA = scan.nextInt();
		char ipChar = scan.next().charAt(0);	
		int inputB = scan.nextInt();			
		switch(ipChar) {
		case '+':
			System.out.println( inputA + inputB);
			break;
		case '-':
			System.out.println( inputA - inputB);
			break;
		case '*':
			System.out.println( inputA * inputB);
			break;
		case '/':
			System.out.println( inputA / inputB);
			break;	
		}
	}

}
