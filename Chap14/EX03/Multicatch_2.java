package Chap14.EX03;

public class Multicatch_2 {
	public static void main(String[] args) {
		
		//1. Exception���� ��� ���ܸ� ó���� �� �ִ�.
			//��� ���ܴ� Exception�� ��ӹ޴´�.
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch(Exception e) {
				//try{} ������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ ��� ó��
			System.out.println("����ó��(Exception)");
		}
		
		//2. catch����� ������ �߸��� ���
//		try {
//			System.out.println(10/0);
//			int num = Integer.parseInt("10A")
//		}catch(Exception e) {
//				//try{} ������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ ��� ó��
//			System.out.println("����ó��(Exception)");
//		}catch(ArithmeticException e) {
//			
//		}catch(NumberFormatException e )
		
		//3. catch����� �ùٸ� ���� : �ֻ��� Exception�� catch����� �������� ��ġ
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
					
		}catch(ArithmeticException e) {		//��������
			
		}catch(NumberFormatException e ) {
			
		}catch(Exception e) {		//�ֻ��� �θ��� Exception�� �������� ��ġ
			//try{} ������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ ��� ó��
			System.out.println("����ó��(Exception)");
		}
		
		//4. �������� exception�� �����ؼ� ����.
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
					
		}catch(ArithmeticException | NumberFormatException e) {		//��������
			
		}catch(Exception e) {		//�ֻ��� �θ��� Exception�� �������� ��ġ
			//try{} ������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ ��� ó��
			System.out.println("����ó��(Exception)");
		}
		
		
	}
}

