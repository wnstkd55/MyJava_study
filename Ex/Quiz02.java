package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		boolean run = true;
		int nu = 0; 	//스캐너로 번호를 인풋받는 변수
		
		do {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("======================");
			System.out.println(" 1. 19단 출력 | 2. 홀수단만 출력 | 3. 3의배수단만 출력 | 4. 종료" );
			System.out.println("======================");
			System.out.println("번호를 입력하세요 >>>");
			nu = sc.nextInt();
			
			if(nu == 1) {	//이중for문을 사용해서 19단 출력
				for (int i = 1; i <= 19; i++) {
					for (int j = 1; j <=19; j++) {
						System.out.println(i+"*"+j+"="+(i*j));
					}System.out.println("=============");
				}
			}
			else if(nu == 2) {	//홀수단만 출력
				for (int i = 1; i <= 19; i++) {
					for (int j = 1; j <=19; j++) {
						if(i % 2 != 0) {
							System.out.println(i+"*"+j+"="+(i*j));
						}
					}System.out.println("=============");
				}
			}
			else if(nu == 3) {
				for (int i = 1; i <= 19; i++) {
					for (int j = 1; j <=19; j++) {
						if(i % 3 == 0) {
							System.out.println(i+"*"+j+"="+(i*j));
						}
					}
			}
			}
			else if(nu == 4) {
				break;
			}
			
		}while (run);
		System.out.println("프로그램을 종료합니다...");
	}

}
