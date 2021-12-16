package javaex100;

import java.util.Scanner;

public class ex50 {

	public static void main(String[] args) {
		//50
		Scanner scan = new Scanner(System.in);
		System.out.println("체중입력.");
		float myKg = scan.nextFloat();
		System.out.println("키 입력.");
		float myM = scan.nextFloat();
		float reBMI = myKg / (myM * 0.01f * myM* 0.01f);
		int myBMI = (int)reBMI;
		System.out.println(myBMI);
		if(myBMI < 18.5) {
			System.out.println("저체중");
		} 
		else if(myBMI >= 18.5 && myBMI<=23) {
			System.out.println("정상체중");
		}
		else if(myBMI > 23) {
			System.out.println("비만");
		System.out.println(myBMI);		
		}
	}

}
