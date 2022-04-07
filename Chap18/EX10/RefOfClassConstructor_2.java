package Chap18.EX10;


interface A{
	B abc(int k);		//����Ÿ���� B ��ü�� ����
}

class B{
	B(){
		System.out.println("ù��° ������");
	}
	B(int k){
		System.out.println("�ι��� ������");
	}
}

public class RefOfClassConstructor_2 {

	public static void main(String[] args) {
		//1. Ŭ���� ������ ����.
		//�͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc(int k) {			//abc()�޼ҵ� ȣ��� B��ü��  ȣ�� ==> ������ ����. 
				return new B(3);			//
			}
		};
		
		//2. ���ٽ� ǥ��
		
		A a2 = (int k) -> {return new B(3);}; 	//��ü ����
		A a3 = k -> new B(3); 			//��� ���� (�ڷ��� ���� ,return , {}; ����) 
		
		//3. Ŭ���� ������ ����
		A a4 = B::new; 			//B�� �ι�° ������ ȣ��
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
		
		
	}

}
