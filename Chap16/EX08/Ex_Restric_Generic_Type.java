package Chap16.EX08;

//제너릭 클래스를 생성해서, 타입 제한(Apple, Strawberry, Banana);, Pencil은 타입으로 접근할 수 없도록
abstract class Fruit{
	public abstract void print();	//추상 메소드
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
		return name + "이고, 가격은 "+price;
	}

	public void print() {
		System.out.println(name + "이고, 가격은 "+price);
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
		return name + "이고, 가격은 "+price;
	}
	
	public void print() {
		System.out.println(name + "이고, 가격은 "+price);
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
		return name + "이고, 가격은 "+price;
	}
	
	public void print() {
		System.out.println(name + "이고, 가격은 "+price);
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
		return name + "이고, 가격은 "+price;
	}
	public void print() {
		System.out.println(name + "이고, 가격은 "+price);
	}
}

 class FruitGeneric<T extends Fruit>{		//DTO(Data Transfer Object)-getter,setter
	 											//VO(Value Object)
	private T Fruit;							//데이터를 받아서 전송하는 중간자 역할을 함.
															//계층간에 값을 받아서 전송, 중간자 역할
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
		appleprint.setFruit(new Apple("사과",3000));
		Apple apple = appleprint.getFruit();
		System.out.println(appleprint);
		System.out.println(apple);
		apple.print();
		System.out.println("=========================");
		
		
		FruitGeneric<Strawberry> Strawberryprint = new FruitGeneric();
		Strawberryprint.setFruit(new Strawberry("딸기",7000));
		Strawberry strawberry = Strawberryprint.getFruit();
		System.out.println(Strawberryprint);
		System.out.println(strawberry);
		strawberry.print();
		System.out.println("=========================");
		
		FruitGeneric<Banana> bananaprint = new FruitGeneric();
		bananaprint.setFruit(new Banana("바나나",2300));
		Banana banana = bananaprint.getFruit();
		System.out.println(bananaprint);
		System.out.println(banana);
		banana.print();
		System.out.println("=========================");
		
//		FruitGeneric<Pencil> pencilprint = new FruitGeneric();
//		pencilprint.setFruit(new pencil("사과",3000));
//		Pencil pencil= pencilprint.getFruit();
//		System.out.println(pencilprint);
//		
	
	}
}
