package ExT;

import java.util.Scanner;

public class Ex12 {
		public static void main(String[] args) {
			String str[] = {"가위","바위","보"};
			Scanner sc = new Scanner(System.in);
			String user;
			String com;
			int c;
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			
			do {
				System.out.println("가위 바위 보! >> ");
				user = sc.next();
				
				if(user.equals("그만")) {
					break;
				}
				c = (int)(Math.random()*3);
				com = str[c];
				
				if(user.equals("바위")) {
					if(com.equals("바위")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 비겼습니다.");
						continue;
					}
					else if(com.equals("가위")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 사용자가 이겼습니다.");
						continue;
					}
					else if(com.equals("보")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 사용자가 졌습니다.");
						continue;
					}
				}
				if(user.equals("가위")) {
					if(com.equals("바위")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 사용자가 졌습니다.");
						continue;
					}
					else if(com.equals("가위")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 비겼습니다.");
						continue;
					}
					else if(com.equals("보")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 사용자가 이겼습니다.");
						continue;
					}
				}
				if(user.equals("보")) {
					if(com.equals("바위")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 사용자가 이겼습니다.");
						continue;
					}
					else if(com.equals("가위")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 사용자가 졌습니다.");
						continue;
					}
					else if(com.equals("보")) {
						System.out.println("사용자= "+user+", 컴퓨터= "+com+" 비겼습니다.");
						continue;
					}
				}
			}while(true);
			System.out.println("게임을 종료합니다.");
			sc.close();
		}

}
