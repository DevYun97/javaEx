package javaex100;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		//13
		Scanner scan = new Scanner(System.in);
		float num = (scan.nextFloat()+0.005f)*100;
		int numInt = (int)num;
		System.out.println(numInt*0.01);
	}

}
