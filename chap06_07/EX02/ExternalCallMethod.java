package chap06_07.EX02;


//�پ��� Ÿ���� �޼ҵ�����(����Ÿ���� �ִ°�� (int, double, String...),
	//����Ÿ���� ���� ���� void ���
public class ExternalCallMethod {

	public static void main(String[] args) {
		//��ü ����
		A a = new A();		//���� ��Ű�� ���� Ŭ������ import���� ȣ���ؼ� ����� �����ϴ�.
		
		//�޼ҵ� ȣ��
		a.print();
		int k = a.data();		// 3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result); 	//8.2
		
		a.printMethod(5); //1~12������ ��
		a.printMethod(25);
		
		//���� : 
		
		System.out.println(a.data());	//��±����� ȣ�Ⱑ���� �޼ҵ�(������ �ִ� �޼ҵ�,)
		//System.out.println(a.print());	//�����߻�
		a.print();		//return���� ���⶧���� �ٷ� ȣ���ؾߵ�.
		System.out.println(a.sum(4, 10.5));
		//System.out.println(a.printMethod(3));	//�����߻�
		a.printMethod(3);
		
	}

}
