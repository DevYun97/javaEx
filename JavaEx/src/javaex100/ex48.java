package javaex100;

import java.util.Scanner;

public class ex48 {

	public static void main(String[] args) {
		//48 나이계산
		Scanner scan = new Scanner(System.in);
		String strYear = scan.nextLine().substring(0,2);
		int sYear= Integer.parseInt(strYear);
		int mSex = scan.nextInt();
		switch(mSex) {
		case 1:
			System.out.print(2018-(1900 + sYear)+1);
			System.out.print(" 남자");
			break;
		case 2:
			System.out.print(2018-(1900 + sYear)+1);
			System.out.print(" 여자");
			break;
		case 3:
			System.out.print(2018-(2000 + sYear)+1);
			System.out.print(" 남자");
			break;
		case 4:
			System.out.print(2018-(2000 + sYear)+1);
			System.out.print(" 여자");
			break;	
		}
	}

}
