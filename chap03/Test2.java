package chap03;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요: ");
		int num = sc.nextInt();
		
		System.out.println("입력하신 정수"+num+"를 16진수로 변환하면"+Integer.toHexString(num)+"입니다.");
		System.out.println("입력하신 정수"+num+"를 8진수로 변환하면"+Integer.toOctalString(num)+"입니다.");
		System.out.println("입력하신 정수"+num+"를 2진수로 변환하면"+Integer.toBinaryString(num)+"입니다.");
		
		sc.close();
		
	}

}
