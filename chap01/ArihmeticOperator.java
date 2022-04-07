package chap01;

import java.util.Scanner;

public class ArihmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력해주세요");
		
		int time = sc.nextInt();
		int sec = time%60;
		int min = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time+"초는"+hour+"시간"+min+"분"+sec+"초 입니다.");
		sc.close();
	
	}

}
