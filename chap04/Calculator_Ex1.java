package chap04;

import java.util.Scanner;

public class Calculator_Ex1 {
	//if문을 이용하여 값을 input 받아서 계산기 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요: ");
		int num2 = sc.nextInt();
		System.out.println("연산자를 입력해주세요: ");
		char opeator = sc.next().charAt(0);  //문자 한글자를 받는것
		int result = 0;
		
		
		
		if(opeator == '+') {
			result = num1 + num2;
		}
		else if(opeator == '-') {
			result = num1 - num2;
		}
		else if(opeator == '*') {
			result = num1 * num2;
		}
		else if(opeator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("연산자 오류 입니다.");
			
		}
		sc.close();
		System.out.println("결과 값은: "+result+"입니다.");

	}

}
