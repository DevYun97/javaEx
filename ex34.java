package javaex100;
import java.util.Random;
public class ex34 {

	public static void main(String[] args) {
//		34
		Random rand = new Random();
		while(true) {
			int randNum = rand.nextInt(10);
			System.out.println(randNum);
			if(randNum == 0) {
				break;
			}
			}
	}

}
