package Chap10.EX04;

//�޼ҵ� �������̵�(MethodOverriding):
	//1. �ݵ�� ��Ӱ��迡���� �޼ҵ� �������̵��� �����ȴ�.
	//2. �θ� Ŭ�������� ����� �޼ҵ带 ���Ӱ� �����ؼ� ����ϴ� ��.
	//3. @Override ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���� �� �ִ�.
	//4. �ñ״��İ� ���ƾ��Ѵ�.(�ñ״��� => �޼ҵ��, �Ű�����Ÿ��, �Ű����� ����)
	//5. �޼ҵ��� ���� �����ڰ� ���ų� ������ 

class A{
	public void print(){
		System.out.println("AŬ����");
	}
}

class B extends A{
	@Override		//�޼ҵ� �������̵��� , �ݵ�� �θ��� �޼ҵ带 �������ϵ��� ����.
	
					//@Override ������̼��� ������� ���� ��� : ��Ÿ�� ���ų� ���Ŀ� ���� ���� ���
					//������ �޼ҵ�� �����ϰ��ִ�.
	public void print() {
		System.out.println("BŬ����");
	}
}

public class MethodOverirding {

	public static void main(String[] args) {
		//1. A Ÿ��	
		A aa = new A();
		aa.print();			//AŬ������ print() ���
		
		//2. BŸ��
		B bb = new B();
		bb.print(); 		//BŬ������ print() ���
		
		//3. AŸ������ ��ĳ����		<<== B�� ��ĳ�����ؼ� 
		A ab = new B();
		ab.print(); 		//AŬ������ print()���
			//ab.print()��   AŬ������ print()�� ȣ��, ���� ���ε��� ���ؼ� BŬ������ print()�� ��� 
		
		
	}

}
