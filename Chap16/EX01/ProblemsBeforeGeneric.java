package Chap16.EX01;

// Generic ����� ������.
// 

class Apple{			//���Ŭ����
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

//1. Apple�� ������ �ִ� Ŭ���� ����
class Goods1{		//��ǰ�� ����� ���� Ŭ����
	private Apple apple = new Apple("���",1000);
	
	public Apple getApple() {		//getter : ��ü �ʵ��� ������ ����ϴ°�
		return apple;
	}
	public void setApple(Apple apple) { //setter
		this.apple = apple;
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

class Goods2{		//��ǰ�� ����� ���� Ŭ����
	private Pencil pencil = new Pencil("����",2000);
	
	public Pencil getPencil() {		//getter : ��ü �ʵ��� ������ ����ϴ°�
		return pencil;
	}
	public void setPencil(Pencil pencil) { //setter
		this.pencil = pencil;
	}
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1  ��ǰ�� ����Ǿ��ִ�. Apple��ü �߰� �� ��������
		Goods1 goods1 = new Goods1();	//�⺻ ������ ȣ��
		goods1.setApple(new Apple("���2",2000));	 		//setter�� ���� �Ҵ��ϰ�
		System.out.println(goods1.getApple());//�ʵ��� ������ ���
		
		//2. Goods2 ��ǰ�� ���� Pencil����
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("����2",3000));	//Setter�� Pencil ��ü ���� �� �� �Ҵ�.
		System.out.println(goods2.getPencil());
		
		
	}

}
