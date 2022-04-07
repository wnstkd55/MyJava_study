package Chap14.EX02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//Checked Exception(�Ϲ� ����) : ������ �ܰ迡�� ���ܰ� �߻�.
//	�������ϱ�(����)		*.java ==> *.class	, ���� ���� ó��

//unChecked Exception(���࿹��), Runtime Exception : ����ÿ� ���ܰ� �߻��� �� �ִ�.
	//���� �ʼ��� �ƴ����� ����ó��

class A{
	B b;
	A(){}	//�⺻ ������.
	
	
	
	interface B{	//�������̽� ����
		void cry();
	}
	void abc() {
		b.cry();
	}
}

public class CheckedException {

	public static void main(String[] args) {
		//1. �Ϲ� ����
		
		//InterruptedException : ������ �߰��� �����Ⱑ �߻��ϸ� ���ܰ� �߻�
		//Thread.sleep(1000);
		
		//ClassNotFoundException : Ŭ������ ã�� ���ϴ� ����
//		Class cls = Class.forName("java.lang.Object");
		
		//IOException : ��Ʈ��ũ���� ����(����)���о� �� �� �ִ� ����
		//System.in : �ܼ��� ����.
		InputStreamReader in = new InputStreamReader(System.in);
		//in.read
		
		//FileNotFoundException
		//FileInputStream fis = new FileInputStream("text.txt");
		
		//���࿹�� (unChecked Exception) : ����ÿ� �߻��Ǵ� ����
		
		//NullPointerException : ��ü�� Null�� ���¿��� ��ü�� �ʵ峪 �޼ҵ� ȣ��
		A a1 = new A();
		a1.abc(); 			//������ �ܰ迡���� ���ܰ� �߻����� �ʰ� ����ÿ� �߻�
		
	}

}
