package chap06_07.EX02;

import java.util.Scanner;

public class Q2 {
	
		static void math(String...values) {
				
				int sum = 0;		//들어오는 정수를 합하는 변수
				double avg = 0.0;		//평균을 저장하는 변수
				
				for (int i = 0; i < values.length; i++) {
					//sum = sum+values[i];	//values [i]번째 방의 값이 String타입이므로 정수타입으로 변환이 필요
					sum += Integer.parseInt(values[i]);
							//Integer.parseInt(String): 숫자형String타입을 정수형으로 전환
					avg = (double)sum/values.length;
				}
				System.out.println("합은: "+sum+", 평균은: "+avg);
			}

	public static void main(String[] args) {
		//[문제] : 스캐너로 임의의 정수값을 받아서 합계 구하기, 평균구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수들을 공백을 넣어서 입력하세요 >> ");
		String num = sc.nextLine();		// 공백이 들어가므로 전체 정수값을 String
		
		String[] array1 = num.split(" ");	//split는 구분자를 기준으로 글자를 잘라서 배열에 저장
		System.out.print("당신이 입력한 정수는: ");
		
				
		for (int i = 0; i < array1.length; i++) {		//입력값을 출력
					System.out.print(array1[i]);
		}
		System.out.println();
				
		math(array1);		//가변 길이 메소드 math를 호출하면서 매개변수로 array1을 넣어주면 된다.
	
		
		
		
	}
	

}
