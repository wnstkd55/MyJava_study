package Chap14.EX08;

public class ExceptionMessage {
	public static void main(String[] args) {
		//1. ���� ��ü ������ �޼��� ���� ���� �ʴ� ���
		
		
		
		try {
			throw new Exception();	//���� ���� �߻�, Exception�� �⺻ ������ ȣ��� �޼����� ȣ����� �ʴ´�.
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================");
			
		//2. ���� ��ü ������ ��ü�� �����ϴ� ���
		try {
			throw new Exception("���� �޼��� ���");		//Exception ��ü �����ڿ� String�����־��ָ� 
		}catch(Exception e) {						//catch������� ���� �޼����� ���
			System.out.println(e.getMessage());
		}
		
	}
}
