package Chap18.EX03.EX1;

import java.util.Scanner;

// 1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ�޽��ϴ�.
// 2. (1) ���ٽĻ���ؼ� ��ǲ���� �� ���� + ,- ,* ,/ (��Ģ����) �����ؼ� ���
//	  (2) �������̽��� ������ �ڽİ�ü�� ����ؼ� ��ǲ���� �� ���� + ,- ,* ,/ (��Ģ����) �����ؼ� ���
//	  (3) �͸� �̳�Ŭ������ ����ؼ� ��ǲ���� �� ���� + ,- ,* ,/ (��Ģ����) �����ؼ� ���

interface Arithmetic{
	void arithmeticOpr(double a, double b);
}

class B_arithmetic implements Arithmetic{
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a + b));
		System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a - b));
		System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a * b));
		System.out.println("<�ڽ�Ŭ����> �� ���� ���� ���� : " + (a / b));
	}
}


public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("doubleŸ���� �� ���� �Է��ϼ���>>>");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		
		// 1. ���ٽ�
		Arithmetic arithmetic1 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� : " + (a + b));};  //��ü����
		Arithmetic arithmetic2 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� : " + (a - b));};
		Arithmetic arithmetic3 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� : " + (a * b));};
		Arithmetic arithmetic4 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� ���� : " + (a / b));};
		
		arithmetic1.arithmeticOpr(num1, num2);
		arithmetic2.arithmeticOpr(num1, num2);
		arithmetic3.arithmeticOpr(num1, num2);
		arithmetic4.arithmeticOpr(num1, num2);
		
		// 2. �������̽��� ������ �ڽİ�ü�� ���
		Arithmetic arithmetic11 = new B_arithmetic();
		
		arithmetic11.arithmeticOpr(num1, num2);
		
		// 3. �͸� �ڽ� Ŭ������ ���
		Arithmetic arithmetic111 = new Arithmetic() {
			@Override
			public void arithmeticOpr(double a, double b) {
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� : " + (a + b));
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� : " + (a - b));
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� : " + (a * b));
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� ���� : " + (a /b));
			}
		};
		arithmetic111.arithmeticOpr(num1, num2);
	}
}