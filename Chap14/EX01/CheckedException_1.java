package Chap14.EX01;

import java.util.Scanner;

//Error : ���α׷��Ӱ� ������ �� ���� �κ�, OS���� �߻��ϴ� Error, H/W Error
//Exception(����) : ���α׷��Ӱ� ������ �� �ִ� �κ�,
	//���ܰ� �߻��Ǹ� ���α׷��� ����Ǿ����
	//���ܰ� �߻� �Ǵ��� ���α׷��� ��������ʰ� ó�� (����ó��)

// ArithmeticException : ����� 0���� ������ �߻��ϴ� ����
	//��ǻ�ʹ� ����� 0���� ������� ���Ұ�.

public class CheckedException_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ϳ��� �Է��ϼ��� >>>");
		int a = sc.nextInt();
		int b = 10;
		
		try {	//try ������� ���� (Exception)�� �߻��� ���
			//try���
			System.out.println(b/a);
			
		}catch(ArithmeticException e) {
			//catch ��� : try{} ������� ������ �߻��� ��� catch{}����� �۵�
			System.out.println("������ �߻��߽��ϴ�. 0���� ���� �� �����ϴ�. �ٸ����� �־��ּ���");
		}finally {
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
