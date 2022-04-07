package ExT;

import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		
			int num=0;
		
			int boom = (int)(Math.random()*100);
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.println("숫자를 입력해보세요: ");
			num = sc.nextInt();
			
			if(boom==num) {
				System.out.println("펑! 터졌습니다!");
				break;
			}
			else if(boom>num) {
				System.out.println("업");
			}
			else if(boom<num) {
				System.out.println("다운");
			}
		}
		
	}

}
