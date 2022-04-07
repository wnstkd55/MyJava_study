package Chap16.EX08;

//���ʸ� Ŭ������ �����ؼ�, Ÿ�� ����(Apple, Strawberry, Banana);, Pencil�� Ÿ������ ������ �� ������
abstract class Fruit{
	public abstract void print();	//�߻� �޼ҵ�
}

class Apple extends Fruit{
	String name;
	int price;
	Apple(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return name + "�̰�, ������ "+price;
	}

	public void print() {
		System.out.println(name + "�̰�, ������ "+price);
	}
}
class Strawberry extends Fruit{
	String name;
	int price;
	Strawberry(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return name + "�̰�, ������ "+price;
	}
	
	public void print() {
		System.out.println(name + "�̰�, ������ "+price);
	}
}

class Banana extends Fruit{
	String name;
	int price;
	Banana(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return name + "�̰�, ������ "+price;
	}
	
	public void print() {
		System.out.println(name + "�̰�, ������ "+price);
	}
}

class Pencil{
	String name;
	int price;
	Pencil(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return name + "�̰�, ������ "+price;
	}
	public void print() {
		System.out.println(name + "�̰�, ������ "+price);
	}
}

 class FruitGeneric<T extends Fruit>{		//DTO(Data Transfer Object)-getter,setter
	 											//VO(Value Object)
	private T Fruit;							//�����͸� �޾Ƽ� �����ϴ� �߰��� ������ ��.
															//�������� ���� �޾Ƽ� ����, �߰��� ����
	public T getFruit() {
		return Fruit;
	}
	public void setFruit(T fruit) {
		Fruit = fruit;
	}
	public String toString() {
		return Fruit.toString();
	}
	public void print() {
		Fruit.print();
	}
}

public class Ex_Restric_Generic_Type {
	public static void main(String[] args) {
		FruitGeneric<Apple> appleprint = new FruitGeneric();
		appleprint.setFruit(new Apple("���",3000));
		Apple apple = appleprint.getFruit();
		System.out.println(appleprint);
		System.out.println(apple);
		apple.print();
		System.out.println("=========================");
		
		
		FruitGeneric<Strawberry> Strawberryprint = new FruitGeneric();
		Strawberryprint.setFruit(new Strawberry("����",7000));
		Strawberry strawberry = Strawberryprint.getFruit();
		System.out.println(Strawberryprint);
		System.out.println(strawberry);
		strawberry.print();
		System.out.println("=========================");
		
		FruitGeneric<Banana> bananaprint = new FruitGeneric();
		bananaprint.setFruit(new Banana("�ٳ���",2300));
		Banana banana = bananaprint.getFruit();
		System.out.println(bananaprint);
		System.out.println(banana);
		banana.print();
		System.out.println("=========================");
		
//		FruitGeneric<Pencil> pencilprint = new FruitGeneric();
//		pencilprint.setFruit(new pencil("���",3000));
//		Pencil pencil= pencilprint.getFruit();
//		System.out.println(pencilprint);
//		
	
	}
}
