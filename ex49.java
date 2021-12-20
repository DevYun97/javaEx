package javaex100;

import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
		//49
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int min = m-30;
		if(h>=0 && h<=24 && m>=0 && m<=59) {
			if(min < 0) {
				System.out.println( h-1 +" "+ (60+min));
			} else {
				System.out.println( h +" "+ min );
			}
		}
	}

}
