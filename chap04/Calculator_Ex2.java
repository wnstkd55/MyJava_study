package chap04;

import java.util.Scanner;

public class Calculator_Ex2 {
		//switch���� �̿��Ͽ� ���� input �޾Ƽ� ���� �����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է����ּ���: ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���: ");
		int num2 = sc.nextInt();
		System.out.println("�����ڸ� �Է����ּ���: ");
		char operator = sc.next().charAt(0);
		int result = 0;
		
		switch(operator) {
		case '+':
			result = num1+num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		case '-':
			result = num1-num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		case '*':
			result = num1*num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		case '/':
			result = num1/num2;
			System.out.println("�����: "+result+"�Դϴ�.");
			break;
		default:
			System.out.println("������ �����Դϴ�.");
			
		}
		sc.close();
	}

}
