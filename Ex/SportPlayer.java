package Ex;

import java.util.Scanner;

public class SportPlayer {

	public static void main(String[] args) {
		/*
		임의의 운동의 이름을 넣고 해당 운동의 구성원(명수)를 넣어서 출력하는 프로그램을 작성후, 전체 합 및 평균을 구하는 프로그램을 작성하세요

		예)
		입력>>>
		탁구2 야구 9 축구11 농구6 씨름2

		출력>>
		탁구:2, 야구:9, 축구:11, 농구:6, 씨름:2
		운동종목의 구성원 총 합계 : 
		운동종목의 평균 구성원수 : 

		"그만"이라고 입력하면 프로그램 종료
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("운동이름 구성원수를 공백을 이용해서 입력하세요. ");
		System.out.println("예) 입력 >>> 탁구 2 야구 9 축구 11 농구 6 씨름 2");
		
		String sport;	// 전체 String값을 인풋받는 변수
		String[] arr;		//공백을 기준으로 잘라서 배열에 저장하는 변수
		int sum = 0;	// 운동 구성원의 멤버의 합을 저장하는 변수
		int memberCount=0;	//
		double avg = 0.0;	//평균을 구하는 변수 : (double로 형변환)전체구성원의 합 / 종목의수
		int member = 0;		//각 종목의 구성원을 담는 변수
		
		
		do {
			sport = sc.nextLine();		//sc.next() : 공백까지만 String
										//sc.nextLine() : 엔터(Enter)까지 전체를 String
			
			if(sport.equals("그만")) {		//str은 참조 자료형이므로 str.equals()
				break;
			}
			arr = sport.split(" ");		//str을 공백을 기준으로 잘라서 arr배열에 저장
			for (int i = 0; i < arr.length; i++) {	//arr.length : 배열의 index 0 ~ 마지막방까지
				if(i % 2 != 0) {	// i :방의 번호이고 숫자만 가지고 온다.
					member = Integer.parseInt(arr[i]);	//각방의 String타입을 정수로 변환
					sum += member;	//sum = sum+member	// 전체 구성원의 합
					memberCount++;	// avg = sum/memberCount
					
				}
			}
			avg = (double) sum/memberCount;	//평균
			
			System.out.println("출력>>>"+sport);
			System.out.println("운동종목의 구성원의 총합계: "+sum);
			System.out.println("운동종목의 평균 구성원의 수: "+avg);
			
		}while(true);
		System.out.println("프로그램을 종료하겠습니다.");
		sc.close();
			
	}
		
}


