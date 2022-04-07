package Chap14.EX08;
//����� ���� ����
// 1. Exception�� ����ϴ� ���� : Checked Exception - �����ϴܰ迡�� ����ó�� �ʿ�.
// 2. RuntimeException�� ����ϴ� ���� : Unchecked Exception, Runtime Exception - ����ÿ� ����

class MyException extends Exception{		//�Ϲݿ���
	public MyException() {	//�⺻������
		super();
	}
	public MyException(String message) {	//���� �޼��� ��½� ���.
		super(message);
	}
}
class MyRTException extends RuntimeException{	//���� ����
	public MyRTException() {	//�⺻������
		super();
	}
	public MyRTException(String message) {	//���� �߻��� �޼����� ������ִ� ������
		super(message);
	}
}

class A{
	//1. ����� ���� ���� ��ü ����(�Ϲ� ���� ��ü)
	MyException me1 = new MyException();	//�⺻ ������ ȣ��
	MyException me2 = new MyException("���� �޼��� : MyException");	 	//���ܰ� �߻��� ���ܸ޼����� ����ϴ� ������.
	
	//2. ��Ÿ�� ���� ��ü
	MyRTException mre1 = new MyRTException();	//�⺻ ������
	MyRTException mre2 = new MyRTException("���ܸ޼��� : MyRTException");
	
	//���ܸ� ������ �߻���Ű��(throw) : 
	void abc_1(int num) {
		
		try {
				if(num>70) {		//abc_1()
				System.out.println("���� �۵�");
			}else {
				throw me1;		//���ܸ� ������ �߻���Ŵ
			}
		}catch (MyException e) {			//me1�� ������ throw�� ����ؼ� ������ ���ܸ� �߻���Ŵ.
			System.out.println("70���ϰ��� �־����ϴ�. 70�̻��� ��������");
			System.out.println(e.getMessage());
		}
	}
	//������ ����(throws) : abc_2()�޼ҵ带 ȣ���ϴ°����� ����ó��
	void abc_2(int num) throws MyException {
		if(num > 70) {
			System.out.println("�����۵�");
		}else {
			throw me1;	//������ ���� �߻�
		}
	}
	
	void bcd_1() {
		abc_1(65); 			//���ܰ� ������ �߻�
	}
	
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70�̻��� ���� ��������");
			System.out.println(e.getMessage());
		}
		
	}
}

public class CreateUserException_1 {

	public static void main(String[] args) {
		A a = new A();
		a.bcd_1(); 			//���ܸ� ���� ����
		a.bcd_2();			//throws ���� ����, ȣ���ϴ� �ʿ��� ����ó��
	}

}
