package chap04;

import java.util.Scanner;

public class Calculator_Ex1 {
	//if���� �̿��Ͽ� ���� input �޾Ƽ� ���� �����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է����ּ���: ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���: ");
		int num2 = sc.nextInt();
		System.out.println("�����ڸ� �Է����ּ���: ");
		char opeator = sc.next().charAt(0);  //���� �ѱ��ڸ� �޴°�
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
			System.out.println("������ ���� �Դϴ�.");
			
		}
		sc.close();
		System.out.println("��� ����: "+result+"�Դϴ�.");

	}

}
