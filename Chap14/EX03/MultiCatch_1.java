package Chap14.EX03;

public class MultiCatch_1 {

	public static void main(String[] args) {

		//1. ���� Exceptionó�� try catchó��
		//ArithmeticException
		try {
			int num = Integer.parseInt("10A");
		}catch(NumberFormatException e) {
			//catch����� �ƹ� ������ ��� ���� ó��
		}
		
		
		//NumberFormatException
		//int num = Integer.parseInt("10A");
		
		//2. ���� Exception ó��
		
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}catch(ArithmeticException e) {
			System.out.println("0 ArithemeticException ���");
		}catch(NumberFormatException k) {
			System.out.println("1 NumberFormatException ���");
		}
		
		//3.���� Exception ó��2
		try {
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println("���߿���ó��");
		}
		
	
	}

}
