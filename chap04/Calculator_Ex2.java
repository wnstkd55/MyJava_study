package chap04;

import java.util.Scanner;

public class Calculator_Ex2 {
		//switch문을 이용하여 값을 input 받아서 계산기 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요: ");
		int num2 = sc.nextInt();
		System.out.println("연산자를 입력해주세요: ");
		char operator = sc.next().charAt(0);
		int result = 0;
		
		switch(operator) {
		case '+':
			result = num1+num2;
			System.out.println("결과는: "+result+"입니다.");
			break;
		case '-':
			result = num1-num2;
			System.out.println("결과는: "+result+"입니다.");
			break;
		case '*':
			result = num1*num2;
			System.out.println("결과는: "+result+"입니다.");
			break;
		case '/':
			result = num1/num2;
			System.out.println("결과는: "+result+"입니다.");
			break;
		default:
			System.out.println("연산자 오류입니다.");
			
		}
		sc.close();
	}

}
