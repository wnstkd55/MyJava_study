package Chap16.EX07;

//���ʸ� �޼ҵ� ���ο��� ��� ������ �޼ҵ� : Object Ŭ������ �޼ҵ常 ��� ����

class A{
	public <T> void method(T t) {
		//System.out.println(t.length()); 		//t.length() : StringŬ�������� ���ڼ� �������� //���Ұ�
		System.out.println(t.equals("�ȳ�"));		//t.equals�� objectŬ������ �޼ҵ�� ��� ����
	}
	public <T extends Object> void method2 (T t) {	// <T [extends Object]> : [ ] ���� ����
		
		System.out.println(t.equals("�ݰ����ϴ�.")); 		//ObjectŬ������ �޼ҵ常 ��� ����
		//System.out.println(t.);
	}
	public <T extends String> void method3(T t) {	//String Ÿ������ ����
		System.out.println(t.length()); 		
		//System.out.println(t.);
	}
}

public class AvailableMethodIngenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");

	}

}
