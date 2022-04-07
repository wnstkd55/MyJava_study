package Chap10.EX07.EX04;

class A{
	String name;
	A(String name){
		this.name = name;
	}
}

class B{
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public String toString() {		//��Ű����.Ŭ����@�ؽ��ڵ� ==>name�ʵ��� ���� ����
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}

public class String_EX02 {

	public static void main(String[] args) {
		String s1 = new String("�ȳ�");
		String s2 = "�ȳ�";
		
		System.out.println(s1);	//String Ŭ������ toString()������ �Ǿ��ִ�.
		System.out.println(s1.equals(s2)); 		//StringŬ������ equals()������ �Ǿ��ִ�.
			//���� ���ϵ��� ������
		
		A a = new A("�ȳ�");
		A a2 = new A("�ȳ�");
		System.out.println(a.equals(a2));
		
		B b1 = new B("�ȳ�");
		B b2 = new B("�ȳ�");
		
		System.out.println(b1);
	}

}
