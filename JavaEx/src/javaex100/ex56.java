package javaex100;
import java.util.Random;
public class ex56 {

	public static void main(String[] args) {
		//56 윷놀이
		
		Random rand = new Random();	
		
		int count = 0;
		for(int i=0; i<4; i++) {
			int gameRandN = rand.nextInt(2);
			if(gameRandN==1) {
				count ++;
			}
			System.out.println(gameRandN);			
		}
		System.out.print(count);	
		if(count == 1) {
			System.out.print(" 도");
		} else if (count == 2) {
			System.out.print(" 개");
		} else if (count == 3) {
			System.out.print(" 걸");
		} else if (count == 4) {
			System.out.print(" 윷");
		} else if (count == 0) {
			System.out.print(" 모");
		}
	}

}
