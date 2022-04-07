package Chap16.EX02;

//Object�� ��� ��ü�� ������ �� �ִ�.
//��ǰ�� �����ϴ� Ŭ������ ObjectŸ������ �����ϸ� ��簴ü�� ���� �� �ִ�.
//Object�� ���� : ��� ��ü�� ���� �� �ִ�.(casting)
		//���� : �Ź� �ٿ� ĳ������ �ؼ� ����ؾߵȴ�.
		//		���� Ÿ�� üũ : ����� ClassCastingException�� �߻��� �� �ִ�.

class Apple{			//���Ŭ����, ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple(String name, int price){	//������
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
		return "�̸� : " + name +" , ����: "+price;
	}
}

class Pencil{		//����Ŭ����
	String name;
	int price;
	
	Pencil(String name, int price){	//�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�.
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
		return "�̸� : " + name +" , ����: "+price;
	}
}

class Goods{		//Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.

	private Object object = new Object();	//Object : ��� Ŭ������ ObjectŸ������ ��ȯ
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Using_Object {

	public static void main(String[] args) {
		//1. Apple�� ������ ���. Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���3",4000));		//setter�� �� �Ҵ�
		System.out.println((Apple) goods1.getObject()); 	//getter�� ��ü�� ��� : Object ==> Apple
		
		//2. Pencil�� ������ ���. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("����4",5000));
		System.out.println((Pencil) goods2.getObject());	//getter�� ��ü�� ��� : Object ==> Pencil
		
		//3. �߸��� ĳ������ �� �� �ִ�.(���� Ÿ�� üũ) : Object
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���4",5000));	
		System.out.println((Pencil)goods3.getObject());		//���� Ÿ�� üũ : ����� ���� �߻�
	}

}
