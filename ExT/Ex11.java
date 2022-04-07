package ExT;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		String name = null;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종료하기위해선 \"그만\"을 입력해주세요 ");
		
		while(true) {		//특정 조건을 만족할때 까지 계속 루프 돌아감.
			System.out.println("과목을 입력해주세요 >>> ");
			name = sc.next();
			
			if(name.equals("그만")) {
				break;
			}	
			// course의 각방을 돌면서 스캐너로 받은 name변수의 값이 같을때
			for (i = 0; i < course.length; i++) {
				if(course[i].equals(name)) {		// 거짓일때 밑의 실행문이 실행되지 않는다.
					System.out.println(course[i]+"의 점수는 "+score[i]+" 입니다.");		
					break;		 
				}
				//마지막 방까지 갔을때는 검색이 안된경우
				if(i==course.length-1) {			//i가 4가 될때까지(마지막까지) 값이 정해지지않았기 때문에 검색되지 않는다.
					System.out.println("없는 과목 입니다.");
				}
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다...");
	}
}



