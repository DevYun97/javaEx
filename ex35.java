package javaex100;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		//35
		Scanner scan = new Scanner(System.in);
		int z = scan.nextInt();
		int sum=0;
		for(int i=1; i<=z; i++) {
			if(i%2==0) {
				sum= sum+i;
			}
		}System.out.println(sum);
	}

}
