package javaex100;

import java.util.Scanner;

public class ex65 {

	public static void main(String[] args) {
		//65
		Scanner scan = new Scanner(System.in);
		int numGame = scan.nextInt();
		for(int i=1; i <= numGame ; i++) {
			if(i%3!=0) {
				System.out.println(i);
			}
			if(i%3==0) {
				System.out.println("X");
			}
		}
	}

}
