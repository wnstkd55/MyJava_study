package Chap10.EX04;

class Animal3 {		//�θ� Ŭ����, ���Ŭ������ ObjectŬ������ ����Ѵ�.
	String name;	
	int age;
	
	void cry() {
		System.out.println("������ ��ϴ�.");
	}

	@Override	//Object.toString �޼ҵ�� ��ü ��ü�� ����Ҷ� ȣ���� �ȴ�.
	public String toString() {		//��ü�� �ּҸ� ����Ѵ�. [��Ű����. Ŭ������@��ü�� �޸��� �ؽ��ڵ�]
		
		return "�̸��� : "+ name+ " ,���̴�: " + age+ " �Դϴ�." ;
		
	}	
}

class Tiger3 extends Animal3{
	
	Tiger3(){}	//�⺻ ������ : ������ �ʱ�ȭ���� �Ҵ����� �ʰ� �ʱ�ȭ.
				//�ٸ������ڰ� ��ü���� ������ ��� �⺻ �����ڸ� �ܺο��� ȣ��� �����Ǿ� ������ �ȵȴ�.
	
	Tiger3(String a, int b){		//������ : ��ü�� �����Ҷ� �޸��� �ʱⰪ�� �Ҵ��Ҷ� ���.
		super.name=a;		//super : �θ�Ŭ����(super)�� �޸𸮸� ����, this : �ڱ��ڽ��� ��ü
		super.age=b;
		
	}

	@Override
	void cry() {
		
		super.cry();		//superŰ����� �θ�Ŭ����, super : ��Ӱ����϶� �θ�Ŭ����
							//thisŰ����� �ڱ� �ڽ��� ��ü
		
		System.out.println("ȣ���̴� �����ϰ� ��ϴ�.");
		
	} 
}

class Cat3 extends Animal3{
	
	Cat3(){	}	//�⺻������
	
	Cat3(String a, int b){	//������
		super.name=a;
		super.age=b;
	}
	
	@Override
	void cry() {
		super.cry();
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}
	
	
}

class Dog3 extends Animal3{
	
	Dog3(){}	//�⺻������
	
	Dog3(String a, int b){		//������
		super.name = a;
		super.age = b;
	}
	
	
	@Override
	void cry() {
		super.cry();
		System.out.println("���� �۸��ϰ� ��ϴ�.");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();		//a3��ü ����
		
		System.out.println(a3);	//��ü ��ü�� ����� ���, ObjectŬ������ toString�޼ҵ� ȣ��
					//Object.toString() : ��ü�� �޸��ּ��� �ؽ��ڵ带 ���
					//Chap10.EX04.Animal3@1c4af82c <==��Ű����.��ü��@�ؽ��ڵ�
		System.out.println(a3.toString());
		
		//��ü ��ü�� ����ϸ� ��ü�� ObjectŬ������ toString�޼ҵ带 ȣ��
		
		Animal3 t3 = new Tiger3();	//Tiger3�� Animal3�� ��ĳ����
		Animal3 c3 = new Cat3();	//Cat3�� Animal3�� ��ĳ����
		Animal3 d3 = new Dog3();	//Dog3�� Animal3�� ��ĳ����
		
		t3.cry();	//�θ��� cry()�� ȣ���� ��� �������̵��� Tiger3�� cry()ȣ��
		c3.cry(); 	//Animal3.cry�� ȣ�� ===>�������̵��� cat3�� cry()ȣ��
		d3.cry();
		
		System.out.println("==================");
		
		Animal3[] arr = {t3,c3,d3};
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("===================");
		for(Animal3 k : arr) {
			k.cry();
		}
		
		System.out.println("===================");
		
		Animal3 aa3 = new Tiger3("ȣ����",5);		//
		Animal3 cc3 = new Cat3("�����",3);
		Animal3 dd3 = new Dog3("��",10);
		
		System.out.println(aa3);		//��ü ��ü�� ��½�, �⺻�����δ� ��ü�� �޸� �ؽ��ڵ尡 ���
										//Object�� toString()�޼ҵ带 ������
		System.out.println(cc3);
		System.out.println(dd3);
		System.out.println("========for==============");
		Animal3[] arr2 = {aa3,cc3,dd3};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("=======enhanced for=========");
		for(Animal3 k : arr2) {
			System.out.println(k);
		}

	}				

}
