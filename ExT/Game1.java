package ExT;

import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		
			int num=0;
		
			int boom = (int)(Math.random()*100);
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.println("���ڸ� �Է��غ�����: ");
			num = sc.nextInt();
			
			if(boom==num) {
				System.out.println("��! �������ϴ�!");
				break;
			}
			else if(boom>num) {
				System.out.println("��");
			}
			else if(boom<num) {
				System.out.println("�ٿ�");
			}
		}
		
	}

}
