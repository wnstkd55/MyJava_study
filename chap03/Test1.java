package chap03;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요: ");
		
		int n1 = sc.nextInt();
		
		System.out.println((n1 % 3 == 0)? "3의배수입니다." : "3의배수가 아닙니다.");
		
		if(n1 % 3 == 0) {
			System.out.println("3의배수입니다.");
		}
		else {
			System.out.println("3의배수가 아닙니다. ");
		}
	}

}
