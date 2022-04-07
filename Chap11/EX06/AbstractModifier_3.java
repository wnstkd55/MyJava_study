package Chap11.EX06;

abstract class Animal{	//추상 클래스 : 추상메소드가 하나 이상 포함되어있는경우
						//추상클래스는 객체 생성 불가, 타입은 사용 가능
						//자식클래스는 부모클래스의 메소드를 구현시 오류를 방지
							//추상클래스는 추상클래스 내의 추상 메소드를 자식 클래스에서 반드시 구현하도록 보장받는다.
	String name;
	int age;
	
	
	
	abstract void cry();		//추상 메소드 : 구현부가 없는 메소드
		//void cry(){}		<== 일반 메소드 : 리터타입 메소드이름(입력매개변수){구현코드}
	abstract void run();		
	
	@Override
		public String toString() {	//객체자체를 출력시 메모리의 정보를 출력
			return "이름: " + name + "나이: "+age;
		}
}

class Cat extends Animal{		//Cat는 Animal상속 일부만 상속한 경우 추상클래스,
											//모두 추상메소드를 구현한 경우는 콘크리트 클래스
	Cat(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {		//추상메소드를 구현한 메소드
		System.out.println("고양이는 야옹");
		
	}

	@Override
	void run() {
		System.out.println("고양이는 4발로간다.");
		
	}
	
}

class Tiger extends Animal{

	Tiger(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("호랑이는 어흥");
		
	}

	@Override
	void run() {
		System.out.println("호랑이는 4발로 간다.");
		
	}
	
}

class Eagle extends Animal{
	
	Eagle(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("독수리는 까악");
		
	}

	@Override
	void run() {
		System.out.println("독수리는 날개로 날아다닌다.");
		
	}
	
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이",10);
		Animal a2 = new Tiger("호랑이",5);
		Animal a3 = new Eagle("독수리",3);
		System.out.println("======================");
		//1. Animal 배열객체에 저장후 
		Animal[] arr = {a1,a2,a3};
		//2. for문을 사용해서 객체를 출력했을때 이름과 나이를 출력, .cry(), run()출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name);
			System.out.println(arr[i].age+"살");
			arr[i].cry();		//객체의 오버라이딩된 메소드 출력
			arr[i].run();		//Animal의 cry(), run() =======>오버라이딩(자식의cry(), run())
			System.out.println("========================");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("============================");
		//3. enhanced for문을 사용해서 이름과 나이를 출력, .cry(), run()출력
		for(Animal a : arr) {
			System.out.print(a.name);
			System.out.println(a.age+"살");
			a.cry();
			a.run();
			System.out.println("========================");
		}
	}

}
