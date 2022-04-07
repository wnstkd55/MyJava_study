package Ex;

import java.util.Scanner;

public class Ex_12_Do {
	public static void main(String[] args) {
		//do-while문을 이용한 가위바위보게임
		
		Scanner sc = new Scanner(System.in);		//값을 입력하기 위한 scanner 사용
		String[] str = {"가위","바위","보"};			//str(문자열배열)에 "가위","바위","보"값을 할당
		String user;								//사용자가 입력한 값을 user라는 변수로 지정,
		String com;												//컴퓨터가 입력한 값을 com이라는 변수로 지정
												
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do {
			System.out.println("가위 바위 보! >> ");
			user=sc.next();					//입력값을 user변수에 할당
			
			if(user.equals("그만")) {
				break;
			}
			int c = (int)(Math.random()*3);		//컴퓨터값 3개의 난수로 지정
			com = str[c];
			
			if(user.equals("가위")) {
				if(com.equals("바위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" (사용자)가 졌습니다.");
					continue;
				}
				else if(com.equals("가위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
					continue;
				}
				else if(com.equals("보")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" (사용자)가 이겼습니다.");
					continue;
				}
			}
			else if(user.equals("바위")) {
				if(com.equals("바위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
					continue;
				}
				else if(com.equals("가위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" (사용자)가 이겼습니다.");
					continue;
				}
				else if(com.equals("보")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" (사용자)가 졌습니다.");
					continue;
				}
			}
			else if(user.equals("보")) {
				if(com.equals("주먹")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" (사용자)가 이겼습니다.");
					continue;
				}
				else if(com.equals("가위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" (사용자)가 졌습니다.");
					continue;
				}
				else if(com.equals("보")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
					continue;
				}
			}
			
		}while(true);
		System.out.println("게임을 종료합니다...");		//do-while문은 한번은 무조건 실행된다.
		sc.close();
	}

}
