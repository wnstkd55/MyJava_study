package chap01;

import java.util.Scanner;

public class ArihmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ʸ� �Է����ּ���");
		
		int time = sc.nextInt();
		int sec = time%60;
		int min = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time+"�ʴ�"+hour+"�ð�"+min+"��"+sec+"�� �Դϴ�.");
		sc.close();
	
	}

}
